package com.bridgeit.bean;

public class Employee {
	private int id;  
	private String name;  
	private String city;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}  
	
	public void displayInformation() {
		System.out.println("Name:"+name +"  "+"Id:"+id+"  "+"city:"+"  "+city);
	}

}
