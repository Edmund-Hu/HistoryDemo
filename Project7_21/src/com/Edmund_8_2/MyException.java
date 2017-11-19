package com.Edmund_8_2;

public class MyException extends Exception {
	String message;
	public MyException(String error){
	this.message=error;
	}
	public String getmessage(){
		return message;
	}
}
