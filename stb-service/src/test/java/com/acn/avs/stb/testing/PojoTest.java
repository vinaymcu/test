/***************************************************************************
 * Copyright (C) Accenture
 * 
 * The reproduction, transmission or use of this document or its contents is not permitted without
 * prior express written consent of Accenture. Offenders will be liable for damages. All rights,
 * including but not limited to rights created by patent grant or registration of a utility model or
 * design, are reserved.
 * 
 * Accenture reserves the right to modify technical specifications and features.
 * 
 * Technical specifications and features are binding only insofar as they are specifically and
 * expressly agreed upon in a written contract.
 * 
 **************************************************************************/

package com.acn.avs.stb.testing;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterChain;
import com.openpojo.reflection.filters.FilterNonConcrete;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.NoFieldShadowingRule;
import com.openpojo.validation.rule.impl.NoNestedClassRule;
import com.openpojo.validation.rule.impl.NoPublicFieldsRule;
import com.openpojo.validation.rule.impl.NoPublicFieldsExceptStaticFinalRule;
import com.openpojo.validation.rule.impl.NoStaticExceptFinalRule;
import com.openpojo.validation.rule.impl.SerializableMustHaveSerialVersionUIDRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.rule.impl.TestClassMustBeProperlyNamedRule;
import com.openpojo.validation.test.impl.DefaultValuesNullTester;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

/**
 * 
 * @author vinay.gupta
 * 
 * Purpose for this class to validate structure of entity for predefine openpojo
 * validation Rule.
 *
 */

public class PojoTest {

	private List<PojoClass> pojoClasses;
	private Validator validator;

	private static final String[] POJO_PACKAGE = { "com.acn.avs.common.entity" };

	@Test
	public void validatePackage() {

		pojoClasses = findEntitiesList();

		validator = ValidatorBuilder.create()
				/****
				 * Create Rules to validate structure of the classes
				 ****/
				// Make sure we have a getter and setter
				.with(new GetterMustExistRule()).with(new SetterMustExistRule())

				// We don't want any primitives in our Pojos.
				// .with(new NoPrimitivesRule())

				// Pojo's should stay simple, don't allow nested classes,
				// anonymous or declared.
				.with(new NoNestedClassRule())

				// Static fields must be final
				.with(new NoStaticExceptFinalRule())

				// Serializable must have serialVersionUID
				.with(new SerializableMustHaveSerialVersionUIDRule())

				// Don't shadow parent's field names.
				.with(new NoFieldShadowingRule())

				// What about public fields, use one of the following rules
				// allow them only if they are static and final.
				.with(new NoPublicFieldsExceptStaticFinalRule())

				// Or you can be more restrictive and not allow ANY public
				// fields in a Pojo.
				.with(new NoPublicFieldsRule())

				// Finally, what if you are testing your Testing code?
				// Make sure your tests are properly named
				.with(new TestClassMustBeProperlyNamedRule())

				// Create Testers to validate the behavior of the classes at
				// runtime.

				// Make sure our setters and getters are behaving as expected.
				.with(new SetterTester()).with(new GetterTester())

				/*
				 * // We don't want any default values to any fields - unless
				 * they are declared final or are primitive.
				 */

				.with(new DefaultValuesNullTester())

				// finalize Validator building.

				.build();
		validator.validate(pojoClasses);
	}

	/**
	 * Get the list of entities classes which used the Entity Annotation
	 * 
	 */
	private List<PojoClass> findEntitiesList() {

		List<PojoClass> entitiesClasses = new ArrayList<>();

		for (String dmePackage : POJO_PACKAGE) {

			entitiesClasses.addAll(PojoClassFactory.getPojoClassesRecursively(dmePackage,
					new FilterChain(new FilterNonConcrete(), new IncludeEntityFilter())));
		}
		return entitiesClasses;
	}
}
