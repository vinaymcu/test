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

package com.acn.avs.stb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.avs.common.entity.common.Resource;
import com.acn.avs.common.entity.stb.Settopbox;
import com.acn.avs.common.entity.stb.SettopboxDefault;
import com.acn.avs.common.entity.stb.SettopboxResource;
import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.common.model.group.Group;
import com.acn.avs.common.model.stb.STB;
import com.acn.avs.common.model.stb.STBDetails;
import com.acn.avs.common.model.stb.STBManager;
import com.acn.avs.common.model.stb.STBWrapper;
import com.acn.avs.common.util.BeanUtils;
import com.acn.avs.stb.enums.IdentificationType;
import com.acn.avs.stb.repository.CustomResourcesRepository;
import com.acn.avs.stb.repository.CustomStbRepository;
import com.acn.avs.stb.repository.StbRepository;
import com.acn.avs.stb.service.StbService;

@Service
public class StbServiceImpl implements StbService {

	@Autowired
	private StbRepository stbRepository;

	@Autowired
	private CustomStbRepository customStbRepository;

	@Autowired
	private CustomResourcesRepository customResourcesRepository;

	@Override
	public STBWrapper save(STBWrapper value) {
		Settopbox dest = new Settopbox();
		SettopboxDefault defaultStb = customStbRepository.findDefaultStb();
		this.copy(defaultStb, dest);
		this.copy(value.getSTB(), dest);
		dest = stbRepository.save(dest);
		value.getSTB().setEquipmentId(dest.getEquipmentId());
		return value;
	}

	@Override
	public STBWrapper update(STBWrapper value) {
		// TODO check any future business requirement/validation/Message if
		// required
		return this.save(value);
	}

	@Override
	public void assignSTB(STBManager value) {

	}

	@Override
	public void createAndAssignSTB(STBManager value) {

	}

	@Override
	public void unassignSTB(STBManager value) {

	}

	@Override
	public void delete(IdentificationType identificationType, String value) {
		customStbRepository.delete(identificationType, value);
	}

	@Override
	public void unassignSTB(String accountNumber, IdentificationType identificationType, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public STBWrapper search(SearchFilter filter) {
		STBDetails stbDetails = new STBDetails();
		List<STB> list = new ArrayList<>();
		stbDetails.setSTBList(list);

		List<Settopbox> settopboxes = customStbRepository.search(filter);
		for (Settopbox orig : settopboxes) {
			STB dest = new STB();
			copy(orig, dest);
			list.add(dest);
		}
		stbDetails.setTotal(list.size());
		return STBWrapper.buildWithSTBDetails(stbDetails);
	}

	private void copy(Settopbox orig, STB dest) {
		BeanUtils.copyProperties(orig, dest);
	}
	
	private void copy1(Settopbox orig, STB dest) {
		
		
		if(StringUtils.isNoneEmpty(orig.getSerialNumber()))
			dest.setSerialNumber(orig.getSerialNumber());
		
		if(StringUtils.isNoneEmpty(orig.getMacAddress()))
			dest.setMacAddress(orig.getMacAddress());
		
		if(StringUtils.isNoneEmpty(orig.getIpAddress()))
			dest.setIpAddress(orig.getIpAddress());
		
		if(StringUtils.isNoneEmpty(orig.getStbName()))
			dest.setsTBName(orig.getStbName());
		
		if(StringUtils.isNoneEmpty(orig.getSwVersion()))
			dest.setSwVersion(orig.getSwVersion());
		
		if(StringUtils.isNoneEmpty(orig.getHwVersion()))
			dest.setHwVersion(orig.getHwVersion());
		
		if(StringUtils.isNoneEmpty(orig.getUiVersion()))
			dest.setUiVersion(orig.getUiVersion());
		
//		if(StringUtils.isNumericSpace(arg0)oneEmpty(orig.getOverridingDefault()))
//			dest.setUiVersion(orig.getUiVersion());
		
//		if(StringUtils.isNoneEmpty(orig.getMaxBwUpdate()))
//			dest.setMaxBwUpdate(orig.getMaxBwUpdate());
		
		if(StringUtils.isNoneEmpty(orig.getCasDeviceId()))
			dest.setCasDeviceId(orig.getCasDeviceId());
		
		if(StringUtils.isNoneEmpty(orig.getVmxClientId()))
			dest.setVmxClientId(orig.getVmxClientId());
		
		
		
		//if(StringUtils.isNoneEmpty(orig.getCompanyId()))
			//dest.setVmxClientId(orig.getVmxClientId());
		
		
	}

	private void copy(STB orig, Settopbox dest) {
		BeanUtils.copyProperties(orig, dest);
		if (orig.getAssignedResources() != null
				&& CollectionUtils.isNotEmpty(orig.getAssignedResources().getResource())) {
			List<SettopboxResource> assignedResources = new ArrayList<>(
					orig.getAssignedResources().getResource().size());
			dest.setSettopboxResourceList(assignedResources);
			for (com.acn.avs.common.model.stb.Resource assignedResource : orig.getAssignedResources().getResource()) {
				Resource resource = customResourcesRepository.findByName(assignedResource.getName());
				SettopboxResource settopboxresource = new SettopboxResource();
				settopboxresource.setResourceId(resource);
				settopboxresource.setAmount(assignedResource.getUnit());
				assignedResources.add(settopboxresource);
			}
		}
	}

	private void copy(SettopboxDefault orig, Settopbox dest) {
		BeanUtils.copyProperties(orig, dest);
	}

	public STBWrapper createDummyStb(STBWrapper value) {
		STB stb = new STB();
		stb.setsTBName("Dummy stb created");
		return STBWrapper.buildWithSTB(stb);

	}

}
