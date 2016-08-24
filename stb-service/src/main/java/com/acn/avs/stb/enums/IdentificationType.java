package com.acn.avs.stb.enums;

public enum IdentificationType {

	macAddress(DataType.STRING, "macAddress"), equipmentId(DataType.INTEGER, "equipmentId"), serialNumber(
			DataType.STRING, "serialNumber"), extIPAddress(DataType.STRING, "extIPAddress");

	private DataType dataType;
	private String property;

	private IdentificationType(DataType dataType, String property) {
		this.dataType = dataType;
		this.property = property;
	}

	public DataType getDataType() {
		return dataType;
	}

	public String getProperty() {
		return property;
	}

	public Object toDataType(String value) {
		if (value == null)
			return value;

		switch (dataType) {
		case INTEGER:
			return Integer.parseInt(value);
		case DATE:
			// TODO use of system level date format to parse the date

		default:
			return value;

		}

	}

}
