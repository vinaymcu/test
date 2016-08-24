package com.acn.avs.stb.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acn.avs.common.model.Services;
import com.acn.avs.common.model.stb.STBWrapper;

@FeignClient(name = Services.CRM_SERVICE)
public interface CRMClient {

	@RequestMapping(method = RequestMethod.POST, value = "/findAll", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public STBWrapper find();

}
