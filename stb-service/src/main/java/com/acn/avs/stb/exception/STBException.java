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

import com.acn.avs.common.exception.BaseException;
import com.acn.avs.common.exception.IErrorCode;

/**
 * The Class STBException.
 * 
 * 
 * 
 * @author sumit.sharma
 */
public class STBException extends BaseException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new STB exception.
	 *
	 * @param errorCode
	 *            the error code
	 */
	public STBException(IErrorCode errorCode) {
		super(errorCode);
	}

	/**
	 * Instantiates a new STB exception.
	 *
	 * @param errorCode
	 *            the error code
	 * @param throwable
	 *            the throwable
	 */
	public STBException(IErrorCode errorCode, Throwable throwable) {
		super(errorCode, throwable);
	}

	/**
	 * Instantiates a new STB exception.
	 *
	 * @param errorCode
	 *            the error code
	 * @param msgParams
	 *            the msg params
	 */
	public STBException(IErrorCode errorCode, Object[] msgParams) {
		super(errorCode, msgParams);
	}

	/**
	 * Instantiates a new STB exception.
	 *
	 * @param errorCode
	 *            the error code
	 * @param msgParams
	 *            the msg params
	 * @param throwable
	 *            the throwable
	 */
	public STBException(IErrorCode errorCode, Object[] msgParams, Throwable throwable) {
		super(errorCode, msgParams, throwable);
	}

}
