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
package com.acn.avs.stb.web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acn.avs.common.model.SearchFilter;
import com.acn.avs.common.model.Services;
import com.acn.avs.common.model.common.Response;
import com.acn.avs.common.model.stb.STBManager;
import com.acn.avs.common.model.stb.STBWrapper;
import com.acn.avs.common.unicastnotifier.message.UnicastMessage;
import com.acn.avs.common.unicastnotifier.sender.UnicastEventSender;
import com.acn.avs.common.validation.ValidationRuleExecutor;
import com.acn.avs.stb.enums.IdentificationType;
import com.acn.avs.stb.service.StbService;

/**
 * The Class StbRepositoryRestController.
 *
 * @author Sumit Kunmar Sahrma
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/stbManager", produces = { MediaType.APPLICATION_JSON_VALUE })
public class StbRestController {

	@Autowired(required = false)
	private UnicastEventSender sender;

	@Autowired(required = false)
	private ValidationRuleExecutor ruleExecutor;

	/** The service. */
	@Autowired
	private StbService service;

	@RequestMapping(value = "/stb", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<STBWrapper> save(@RequestBody STBWrapper stbWrapper) {
		if (ruleExecutor != null) {
			ruleExecutor.fireAllRule("create_stb_validation_rule", stbWrapper);
		}
		STBWrapper STBWrapper = service.save(stbWrapper);
		if (sender != null) {
			UnicastMessage unicastMessage = new UnicastMessage();
			unicastMessage.setMessage(STBWrapper.getSTB().toString());
			sender.send(unicastMessage, Services.UNICAST_SERVICE);
		}
		return ResponseEntity.ok(STBWrapper);
	}

	@RequestMapping(value = "/stb", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<STBWrapper> update(@RequestBody STBWrapper stbManager) {
		return ResponseEntity.ok(service.update(stbManager));
	}

	@RequestMapping(value = "assignSTB", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<STBManager> assignSTB(@RequestBody STBManager stbManager) {
		return null;
	}

	@RequestMapping(value = "/{accountNumber}/{identificationType}/{value}", method = RequestMethod.PUT)
	public ResponseEntity<Void> unassignSTB(@PathVariable("accountNumber") String accountNumber,
			@PathVariable("identificationType") String identificationType, @PathVariable("value") String value) {
		return null;
	}

	@RequestMapping(value = "/stb/{identificationType}/{value}", method = RequestMethod.DELETE)
	public ResponseEntity<Response> delete(@PathVariable("identificationType") IdentificationType identificationType,
			@PathVariable("value") String value) {
		service.delete(identificationType, value);
		return ResponseEntity.ok(Response.success());
	}

	@RequestMapping(value = "/stbList", method = RequestMethod.GET)
	public ResponseEntity<STBWrapper> search(SearchFilter filter) {
		return ResponseEntity.ok(service.search(filter));
	}
}
