package com.edmund.entity;

/**
 * Planeorder entity. @author MyEclipse Persistence Tools
 */

public class Planeorder implements java.io.Serializable {

	// Fields

	private Integer id;
	private Plane plane;
	private String type;
	private Integer number;
	private Double price;
	private Double total;
	private String orderflag;

	// Constructors

	/** default constructor */
	public Planeorder() {
	}

	/** full constructor */
	public Planeorder(Plane plane, String type, Integer number, Double price,
			Double total, String orderflag) {
		this.plane = plane;
		this.type = type;
		this.number = number;
		this.price = price;
		this.total = total;
		this.orderflag = orderflag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Plane getPlane() {
		return this.plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getOrderflag() {
		return this.orderflag;
	}

	public void setOrderflag(String orderflag) {
		this.orderflag = orderflag;
	}

}