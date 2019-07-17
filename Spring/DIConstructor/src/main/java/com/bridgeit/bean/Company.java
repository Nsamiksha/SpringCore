package com.bridgeit.bean;

public class Company {
private String name;

private int totalShares;

public Company(String name, int totalShares) {
	super();
	this.name = name;
	this.totalShares = totalShares;
}



public void show(){  
   System.out.println(name+" "+totalShares);  
}
}
