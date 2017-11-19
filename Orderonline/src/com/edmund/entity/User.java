package com.edmund.entity;

public class User {
	private int userid;
	private String username;
	private String password;
	private String phone;
	private String address;
	private Double balance;
	private String payword;
	
	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public String getPayword() {
		return payword;
	}


	public void setPayword(String payword) {
		this.payword = payword;
	}

	public String toString(){
		return userid+"\t"+username+"\t"+password;
	}
	
	
}
