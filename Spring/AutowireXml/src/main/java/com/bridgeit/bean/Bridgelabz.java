package com.bridgeit.bean;

public class Bridgelabz {
	School school;

	Bridgelabz() {
		System.out.println("Welcome to Bridgelabz");
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	void print() {
		System.out.println(" You Are in Bridgelabz");
	}

	public void display() {
		print();
		school.print();
	}
}
