package com.acn.avs.stb.testing;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.persistence.Entity;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoClassFilter;

/**
 * Apply the filter on entities classes which used the Entity Annotation
 * @author vinay.gupta
 */

public class IncludeEntityFilter implements PojoClassFilter {

    @Override
    public boolean include(PojoClass pojoClass) {

        boolean include = false;
        List<? extends Annotation> annotations = pojoClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Entity) {
                include = true;
                break;
            }
        }
        return include;
    }
}
