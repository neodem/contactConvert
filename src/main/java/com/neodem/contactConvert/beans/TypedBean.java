package com.neodem.contactConvert.beans;

import com.neodem.common.beans.AbstractBean;

public class TypedBean {
	private AbstractBean bean;
	private String type;
	
	public AbstractBean getBean() {
		return bean;
	}
	public void setBean(AbstractBean bean) {
		this.bean = bean;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
