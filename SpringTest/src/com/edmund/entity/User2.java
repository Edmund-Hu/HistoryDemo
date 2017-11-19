package com.edmund.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class User2 {
	private int id;
	private String name;
	private List<String> hobbies;
	private Set<String> hobbies2;
	private Map<String,String> hobbies3;
	public Set<String> getHobbies2() {
		return hobbies2;
	}
	public void setHobbies2(Set<String> hobbies2) {
		this.hobbies2 = hobbies2;
	}
	public Map<String, String> getHobbies3() {
		return hobbies3;
	}
	public void setHobbies3(Map<String, String> hobbies3) {
		this.hobbies3 = hobbies3;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public User2(){};
	public User2(int id, String name){
		this.id= id;
		this.name = name;
	}
	
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
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", hobbies2=" + hobbies2 + ", hobbies3="
				+ hobbies3 + ", getHobbies2()=" + getHobbies2() + ", getHobbies3()=" + getHobbies3() + ", getHobbies()="
				+ getHobbies() + ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
}
