package com.edmund.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String phone;
	private String idcard;
	private String email;
	private Integer age;
	private String sex;
	private Integer level;
	private Set topassengers = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String phone, String idcard) {
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.idcard = idcard;
	}

	/** full constructor */
	public User(String username, String password, String phone, String idcard,
			String email, Integer age, String sex, Integer level,
			Set topassengers) {
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.idcard = idcard;
		this.email = email;
		this.age = age;
		this.sex = sex;
		this.level = level;
		this.topassengers = topassengers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Set getTopassengers() {
		return this.topassengers;
	}

	public void setTopassengers(Set topassengers) {
		this.topassengers = topassengers;
	}

}