package com.neodem.contactConvert.fields;

public abstract class VCardField {
	private String fieldName;
	protected String value;
	
	public VCardField(String name) {
		fieldName = name;
		value = null;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
