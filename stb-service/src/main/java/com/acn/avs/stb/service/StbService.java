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

package com.acn.avs.stb.service;

import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.common.model.stb.STBManager;
import com.acn.avs.common.model.stb.STBWrapper;
import com.acn.avs.stb.enums.IdentificationType;

/**
 * The Interface StbService.
 * 
 * @author Sumit.Sharma
 * @since 1.0
 * 
 * 
 * 
 * 
 * 
 */
public interface StbService {

	/**
	 * Save.
	 *
	 * @param value
	 *            the value
	 * @return the STB wrapper
	 */
	STBWrapper save(STBWrapper value);

	/**
	 * Update.
	 *
	 * @param value
	 *            the value
	 * @return the STB wrapper
	 */
	STBWrapper update(STBWrapper value);

	/**
	 * Assign STB.
	 *
	 * @param value
	 *            the value
	 */
	void assignSTB(STBManager value);

	/**
	 * Creates the and assign STB.
	 *
	 * @param value
	 *            the value
	 */
	void createAndAssignSTB(STBManager value);

	/**
	 * Unassign STB.
	 *
	 * @param value
	 *            the value
	 */
	void unassignSTB(STBManager value);

	/**
	 * Delete.
	 *
	 * @param identificationType
	 *            the identification type
	 * @param value
	 *            the value
	 */
	void delete(IdentificationType identificationType, String value);

	/**
	 * Unassign STB.
	 *
	 * @param accountNumber
	 *            the account number
	 * @param identificationType
	 *            the identification type
	 * @param value
	 *            the value
	 */
	void unassignSTB(String accountNumber, IdentificationType identificationType, String value);

	/**
	 * Search.
	 *
	 * @param filter
	 *            the filter
	 * @return the STB wrapper
	 */
	STBWrapper search(SearchFilter filter);

}
