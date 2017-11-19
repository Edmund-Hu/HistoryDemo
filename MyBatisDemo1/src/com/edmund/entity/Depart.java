package com.edmund.entity;

import java.util.List;

public class Depart {
	private int id;
	private String name;
	private int count;
	private List<User> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Depart [id=" + id + ", name=" + name + ", count=" + count + ", users=" + users + "]";
	}


}
