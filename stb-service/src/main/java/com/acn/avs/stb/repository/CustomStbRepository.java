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

package com.acn.avs.stb.repository;

import java.util.List;

import com.acn.avs.common.entity.stb.Settopbox;
import com.acn.avs.common.entity.stb.SettopboxDefault;
import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.stb.enums.IdentificationType;

public interface CustomStbRepository {

	SettopboxDefault findDefaultStb();

	List<Settopbox> search(SearchFilter searchFilter);

	void delete(IdentificationType identificationType, String value);

	void unassignSTB(String accountNumber, IdentificationType identificationType, String value);

}
