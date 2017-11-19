package com.edmund.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class User2 {
	private String name;
	private int age;
	private User user;
	private List<String> hobbies = new ArrayList<String>();
	private Set<String> loves = new HashSet<String>();
	private Map<String, String> map = new HashMap<String, String>();
	private Properties address = new Properties();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Set<String> getLoves() {
		return loves;
	}
	public void setLoves(Set<String> loves) {
		this.loves = loves;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Properties getAddress() {
		return address;
	}
	public void setAddress(Properties address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User2 [name=" + name + ", age=" + age + ", user=" + user + ", hobbies=" + hobbies + ", loves=" + loves
				+ ", map=" + map + ", address=" + address + "]";
	}
	


}
