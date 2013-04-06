package com.neodem.contactConvert.beans;

import java.util.Date;

import com.neodem.common.beans.Name;

public class MyVCard extends VCard{
	private Name name;
	private TypedBean[] phoneNumbers;
	private TypedBean[] emails;
	private TypedBean[] mailingAddresses;
	private Photo photo;
	private String workPlace;
	private String nickName;
	private Date birthdate;
	
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public TypedBean[] getEmails() {
		return emails;
	}
	public void setEmails(TypedBean[] emails) {
		this.emails = emails;
	}
	public TypedBean[] getMailingAddresses() {
		return mailingAddresses;
	}
	public void setMailingAddresses(TypedBean[] mailingAddresses) {
		this.mailingAddresses = mailingAddresses;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public TypedBean[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(TypedBean[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	
}
