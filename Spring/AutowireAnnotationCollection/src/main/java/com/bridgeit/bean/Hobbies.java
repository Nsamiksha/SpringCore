package com.bridgeit.bean;

import java.util.Arrays;

public class Hobbies {
	
	 private String[] hobbies;

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Hobbies [hobbies=" + Arrays.toString(hobbies) + "]";
	}
}
