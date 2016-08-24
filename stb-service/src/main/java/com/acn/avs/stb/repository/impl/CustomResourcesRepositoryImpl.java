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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.acn.avs.common.entity.common.Resource;
import com.acn.avs.stb.repository.CustomResourcesRepository;

/**
 * 
 * @author sumit.sharma
 * @since 1.0
 */

@Repository
@CacheConfig(cacheNames = "resources")
public class CustomResourcesRepositoryImpl implements CustomResourcesRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Cacheable
	@Override
	public Resource findByName(String name) {
		return entityManager.createNamedQuery("RESOURCE.FIND_BY_NAME", Resource.class).setParameter("name", name)
				.getSingleResult();
	}

	@Override
	public boolean validateExistenceByName(String name) {
		Long count = entityManager.createNamedQuery("RESOURCE.VALIDATE_EXISTENCE_BY_NAME", Long.class)
				.setParameter("name", name).getSingleResult();
		return (count > 0);
	}
}
