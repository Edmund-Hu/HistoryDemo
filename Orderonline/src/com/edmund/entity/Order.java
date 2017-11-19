package com.edmund.entity;

import net.sf.json.JSONArray;

public class Order {
	private int orderId;
	private int userId;
	private JSONArray goodinfo;
	private String time;
	private String status;
	private String totalmoney;
	
	public String getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}


	public JSONArray getGoodinfo() {
		return goodinfo;
	}
	public void setGoodinfo(JSONArray goodinfo) {
		this.goodinfo = goodinfo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
