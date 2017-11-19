package com.edmund.entity;

/**
 * Extra entity. @author MyEclipse Persistence Tools
 */

public class Extra implements java.io.Serializable {

	// Fields

	private Integer id;
	private City city;
	private String name;
	private String picture;
	private String price;
	private String introduce;
	private String type;

	// Constructors

	/** default constructor */
	public Extra() {
	}

	/** full constructor */
	public Extra(City city, String name, String picture, String price,
			String introduce, String type) {
		this.city = city;
		this.name = name;
		this.picture = picture;
		this.price = price;
		this.introduce = introduce;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}