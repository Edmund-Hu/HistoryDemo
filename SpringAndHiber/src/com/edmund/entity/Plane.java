package com.edmund.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Plane entity. @author MyEclipse Persistence Tools
 */

public class Plane implements java.io.Serializable {

	// Fields

	private Integer id;
	private String number;
	private Integer buttom;
	private Integer middle;
	private Integer top;
	private Set planeorders = new HashSet(0);
	private Set flights = new HashSet(0);

	// Constructors

	/** default constructor */
	public Plane() {
	}

	/** minimal constructor */
	public Plane(String number, Integer buttom, Integer middle, Integer top) {
		this.number = number;
		this.buttom = buttom;
		this.middle = middle;
		this.top = top;
	}

	/** full constructor */
	public Plane(String number, Integer buttom, Integer middle, Integer top,
			Set planeorders, Set flights) {
		this.number = number;
		this.buttom = buttom;
		this.middle = middle;
		this.top = top;
		this.planeorders = planeorders;
		this.flights = flights;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getButtom() {
		return this.buttom;
	}

	public void setButtom(Integer buttom) {
		this.buttom = buttom;
	}

	public Integer getMiddle() {
		return this.middle;
	}

	public void setMiddle(Integer middle) {
		this.middle = middle;
	}

	public Integer getTop() {
		return this.top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Set getPlaneorders() {
		return this.planeorders;
	}

	public void setPlaneorders(Set planeorders) {
		this.planeorders = planeorders;
	}

	public Set getFlights() {
		return this.flights;
	}

	public void setFlights(Set flights) {
		this.flights = flights;
	}

}