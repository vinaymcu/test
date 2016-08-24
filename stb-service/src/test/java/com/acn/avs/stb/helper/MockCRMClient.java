package com.acn.avs.stb.helper;

import org.springframework.stereotype.Component;

import com.acn.avs.common.model.stb.STBCommunication;
import com.acn.avs.common.model.stb.STBWrapper;
import com.acn.avs.stb.client.CRMClient;

@Component
public class MockCRMClient implements CRMClient{

	@Override
	public STBWrapper find() {
		// TODO Auto-generated method stub
		return null;
	}

}
