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
package com.acn.avs.stb.exception;

import com.acn.avs.common.exception.IErrorCode;

public enum ErrorCode implements IErrorCode {

	SYSTEM_EXCEPTION("STB-000"),
	MANDATORY_PARAMETER_MISSING("STB-001"),
	STB_PROFILES_NOT_FOUND("STB-002"),
	DEVICE_RESOURCE_CONTROL_NOT_FOUND("STB-003"),
	IMPROPER_REQUEST("STB-004"),
	RESOURCE_ALREADY_ASSIGNED("STB-005"),
	STB_NAME_EXCEEDS_20_CHARACTERS("STB-087"),
	NO_STB_CONNECTION_MODE_COULD_BE_ASSIGNED("STB-014"),
	STB_REGISTER_FAILED("STB-027"),
	INVALID_STB_PARAMETER("STB-055"),
	INVALID_HARDWARE_VERSION("STB-053"),
	DUPLICATE_SERIAL_NUMBER("STB-051"),
	DUPLICATE_EQUIPMENT_STBID("STB-068"),
	PROPERTY_NOT_MAPPED_FOR_CRITERIA("STB-069");

	private String errorCode;

	private ErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String getCode() {
		return this.errorCode;
	}

}
