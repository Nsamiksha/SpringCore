package com.bridgeit.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	//you want autowired this field.
	private Person person;
	
	
	private int type;
	private String action;
	
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public String toString() {
		return "Customer [person=" + person + ", type=" + type + ", action=" + action + "]";
	}
	
	
}
