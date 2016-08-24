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

package com.acn.avs.stb.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.acn.avs.common.entity.stb.Settopbox;
import com.acn.avs.common.entity.stb.SettopboxDefault;
import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.stb.enums.IdentificationType;
import com.acn.avs.stb.repository.CustomStbRepository;

/**
 * 
 * @author sumit.sharma
 * @since 1.0
 */

@Repository
@CacheConfig(cacheNames = "settopbox")
public class CustomStbRepositoryImpl implements CustomStbRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private StbSearchCriteriaMapperImpl criteriaMapperImpl;

	@Cacheable
	@Override
	public SettopboxDefault findDefaultStb() {
		return entityManager.createNamedQuery("DEFAULT_STB.FIND", SettopboxDefault.class).getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Settopbox> search(SearchFilter filter) {
		String searchValue = filter.getSearchValue();
		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("SELECT S FROM Settopbox S ");
		filter.setMapper(criteriaMapperImpl);
		queryBuilder.append(filter.buildCompeleteCriteria("S"));
		Query query = entityManager.createQuery(queryBuilder.toString());

		if (queryBuilder.indexOf("WHERE") > 0) {
			query.setParameter("param", searchValue);
		}

		if (filter.getStartIndex() != null) {
			query.setFirstResult(filter.getStartIndex());
		}
		if (filter.getPageSize() != null) {
			query.setMaxResults(filter.getPageSize());
		}
		return query.getResultList();
	}

	@Override
	@Transactional
	public void delete(IdentificationType identificationType, String value) {
		StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("DELETE FROM Settopbox WHERE ");
		queryBuilder.append(identificationType.getProperty());
		queryBuilder.append(" =:value ");
		Query query = entityManager.createQuery(queryBuilder.toString());
		query.setParameter("value", identificationType.toDataType(value));
		query.executeUpdate();
	}

	@Override
	public void unassignSTB(String accountNumber, IdentificationType identificationType, String value) {
		// TODO Auto-generated method stub

	}

}
