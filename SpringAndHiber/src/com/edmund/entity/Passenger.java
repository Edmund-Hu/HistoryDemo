package com.edmund.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Passenger entity. @author MyEclipse Persistence Tools
 */

public class Passenger implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String idcard;
	private Set topassengers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Passenger() {
	}

	/** minimal constructor */
	public Passenger(String name, String idcard) {
		this.name = name;
		this.idcard = idcard;
	}

	/** full constructor */
	public Passenger(String name, String idcard, Set topassengers) {
		this.name = name;
		this.idcard = idcard;
		this.topassengers = topassengers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Set getTopassengers() {
		return this.topassengers;
	}

	public void setTopassengers(Set topassengers) {
		this.topassengers = topassengers;
	}

}