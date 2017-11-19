package com.edmund.web;

public class User {
	private String name;
	private String password;
	private String sex;
	private String email;
	
	public User(){
		
	}
	public User(String name, String password, String sex, String email) {
		super();
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
