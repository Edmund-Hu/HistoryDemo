package com.edmund.entity;

import java.util.Arrays;

public class User {
	private String name;
	private String password;
	private String[] hobbies;
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
}
