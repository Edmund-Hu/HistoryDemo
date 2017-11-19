package com.edmund.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cityname;
	private String place;
	private Set extras = new HashSet(0);
	private Set flightsForFrom = new HashSet(0);
	private Set flightsForCome = new HashSet(0);

	// Constructors

	/** default constructor */
	public City() {
	}

	/** minimal constructor */
	public City(String cityname, String place) {
		this.cityname = cityname;
		this.place = place;
	}

	/** full constructor */
	public City(String cityname, String place, Set extras, Set flightsForFrom,
			Set flightsForCome) {
		this.cityname = cityname;
		this.place = place;
		this.extras = extras;
		this.flightsForFrom = flightsForFrom;
		this.flightsForCome = flightsForCome;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityname() {
		return this.cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Set getExtras() {
		return this.extras;
	}

	public void setExtras(Set extras) {
		this.extras = extras;
	}

	public Set getFlightsForFrom() {
		return this.flightsForFrom;
	}

	public void setFlightsForFrom(Set flightsForFrom) {
		this.flightsForFrom = flightsForFrom;
	}

	public Set getFlightsForCome() {
		return this.flightsForCome;
	}

	public void setFlightsForCome(Set flightsForCome) {
		this.flightsForCome = flightsForCome;
	}

}