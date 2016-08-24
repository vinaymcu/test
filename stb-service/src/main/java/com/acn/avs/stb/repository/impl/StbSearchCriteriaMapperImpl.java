package com.acn.avs.stb.repository.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.acn.avs.common.model.SearchCriteriaMapper;
import com.acn.avs.stb.exception.ErrorCode;
import com.acn.avs.stb.exception.STBException;

@Component
public class StbSearchCriteriaMapperImpl implements SearchCriteriaMapper {

	private Map<String, String> map = new HashMap<>();

	@Override
	public String mapProperty(String criteria) {
		String property = map.get(criteria);
		if (StringUtils.isEmpty(property)) {
			throw new STBException(ErrorCode.PROPERTY_NOT_MAPPED_FOR_CRITERIA, new String[] { criteria });
		}
		return property;
	}

	// TODO missing property mapping for Subscriber Name and Assigned Status
	@PostConstruct
	public void init() {
		map.put("Serial Number", "serialNumber");
		// map.put("Subscriber Name", arg1);
		map.put("IP Address", "ipAddress");
		map.put("MAC Address", "macAddress");
		map.put("Software Version", "swVersion");
		map.put("UI Version", "uiVersion");
		map.put("Hardware Version", "hwVersion");
		// map.put("Assigned Status", arg1);
	}
}
