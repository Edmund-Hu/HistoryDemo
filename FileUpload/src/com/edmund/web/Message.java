package com.edmund.web;

public class Message {
	private int id;
	private String message;
	private String username;
	private String inserttime;
	
	public Message(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getInserttime() {
		return inserttime;
	}

	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
	}

	public Message(int id, String message, String username, String inserttime) {
		super();
		this.id = id;
		this.message = message;
		this.username = username;
		this.inserttime = inserttime;
	}

	public String toString(){
		return message+inserttime;
	}
	
	
}


