package com.acn.avs.stb.Generator;

import com.acn.avs.common.model.stb.STB;

public class STBServiceGenerator extends
		AbstractEntityGenerator<STB> {

	@Override
	public Class<STB> getEntityClass() {
		return STB.class;
	}

	@Override
	protected void buildLists() {
		RandomData randomData = new RandomData();
		AssignedResourcesGenerator assignGenerate = new AssignedResourcesGenerator();
		addDependency(assignGenerate.getValid().get(0));

		// add valid with all fields
		for (int index = 0; index < 3; index++) {
			STB stb = new STB();
			// stb.setEquipmentId(randomData.randomInteger(1));
			stb.setSerialNumber(randomData.randomString(5));
			stb.setMacAddress(randomData.randomString(20));
			stb.setIpAddress(String.valueOf(randomData.randomInteger(3)) + "." + randomData.randomInteger(3) + "."
					+ randomData.randomInteger(3) + "." + randomData.randomInteger(3));
			stb.setsTBName(randomData.randomString(20));
			stb.setSwVersion(String.valueOf(randomData.randomInteger(1)));
			stb.setHwVersion(String.valueOf(randomData.randomInteger(1)));
			stb.setUiVersion(String.valueOf(randomData.randomInteger(1)));
			stb.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
			stb.setAssignedResources(assignGenerate.getValid().get(0));
			stb.setOverridingDefault(String.valueOf(randomData.randomInteger(1)));
			stb.setMaxBwUpdate(String.valueOf(randomData.randomInteger(1)));
			stb.setCasDeviceId(randomData.randomString(20));
			stb.setVmxClientId(randomData.randomString(20));
			addValid(stb);
		}

		// add valid with required fields
		for (int index = 0; index < 3; index++) {
			STB stb = new STB();
			// stb.setEquipmentId(randomData.randomInteger(1));
			stb.setSerialNumber(randomData.randomString(5));
			stb.setMacAddress(randomData.randomString(20));
			stb.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
			stb.setVmxClientId(randomData.randomString(20));
			addValid(stb);
		}

		// add invalid with null values

		// Null serialNumber #1
		STB stb1 = new STB();
		stb1.setEquipmentId(randomData.randomInteger(1));
		stb1.setSerialNumber(null);
		stb1.setMacAddress(randomData.randomString(20));
		stb1.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb1.setVmxClientId(randomData.randomString(20));
		addInvalid(stb1);

		// Null macAddress #2
		STB stb2 = new STB();
		stb2.setEquipmentId(randomData.randomInteger(1));
		stb2.setSerialNumber(randomData.randomString(5));
		stb2.setMacAddress(null);
		stb2.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb2.setVmxClientId(randomData.randomString(20));
		addInvalid(stb2);

		// Null vmxClientId #4
		STB stb3 = new STB();
		stb3.setEquipmentId(randomData.randomInteger(1));
		stb3.setSerialNumber(randomData.randomString(5));
		stb3.setMacAddress(randomData.randomString(20));
		stb3.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb3.setVmxClientId(null);
		addInvalid(stb3);

		// Null Assigned Resource #4
		STB stb4 = new STB();
		stb4.setEquipmentId(randomData.randomInteger(1));
		stb4.setSerialNumber(randomData.randomString(5));
		stb4.setMacAddress(randomData.randomString(20));
		stb4.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb4.setVmxClientId(randomData.randomString(20));
		addInvalid(stb4);

		// Null resources of Assigned Resource #4
		STB stb5 = new STB();
		stb5.setEquipmentId(randomData.randomInteger(1));
		stb5.setSerialNumber(randomData.randomString(5));
		stb5.setMacAddress(randomData.randomString(20));
		stb5.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb5.setVmxClientId(randomData.randomString(20));
		stb5.setAssignedResources(assignGenerate.getValid().get(3));
		addInvalid(stb5);

		// wrong resource name of Assigned Resource #4
		STB stb6 = new STB();
		stb6.setEquipmentId(randomData.randomInteger(1));
		stb6.setSerialNumber(randomData.randomString(5));
		stb6.setMacAddress(randomData.randomString(20));
		stb6.setAssignmentStatus(String.valueOf(randomData.randomInteger(1)));
		stb6.setVmxClientId(randomData.randomString(20));
		stb6.setAssignedResources(assignGenerate.getValid().get(3));
		addInvalid(stb5);

	}


}
