package com.edmund.entity;

import java.sql.Time;

/**
 * Flight entity. @author MyEclipse Persistence Tools
 */

public class Flight implements java.io.Serializable {

	// Fields

	private Integer id;
	private Plane plane;
	private City cityByCome;
	private City cityByFrom;
	private Time comtime;
	private Time fromtime;
	private Integer buttom;
	private Double bprice;
	private Integer middle;
	private Double mprice;
	private Integer top;
	private Double tprice;

	// Constructors

	/** default constructor */
	public Flight() {
	}

	/** full constructor */
	public Flight(Plane plane, City cityByCome, City cityByFrom, Time comtime,
			Time fromtime, Integer buttom, Double bprice, Integer middle,
			Double mprice, Integer top, Double tprice) {
		this.plane = plane;
		this.cityByCome = cityByCome;
		this.cityByFrom = cityByFrom;
		this.comtime = comtime;
		this.fromtime = fromtime;
		this.buttom = buttom;
		this.bprice = bprice;
		this.middle = middle;
		this.mprice = mprice;
		this.top = top;
		this.tprice = tprice;
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

	public City getCityByCome() {
		return this.cityByCome;
	}

	public void setCityByCome(City cityByCome) {
		this.cityByCome = cityByCome;
	}

	public City getCityByFrom() {
		return this.cityByFrom;
	}

	public void setCityByFrom(City cityByFrom) {
		this.cityByFrom = cityByFrom;
	}

	public Time getComtime() {
		return this.comtime;
	}

	public void setComtime(Time comtime) {
		this.comtime = comtime;
	}

	public Time getFromtime() {
		return this.fromtime;
	}

	public void setFromtime(Time fromtime) {
		this.fromtime = fromtime;
	}

	public Integer getButtom() {
		return this.buttom;
	}

	public void setButtom(Integer buttom) {
		this.buttom = buttom;
	}

	public Double getBprice() {
		return this.bprice;
	}

	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}

	public Integer getMiddle() {
		return this.middle;
	}

	public void setMiddle(Integer middle) {
		this.middle = middle;
	}

	public Double getMprice() {
		return this.mprice;
	}

	public void setMprice(Double mprice) {
		this.mprice = mprice;
	}

	public Integer getTop() {
		return this.top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public Double getTprice() {
		return this.tprice;
	}

	public void setTprice(Double tprice) {
		this.tprice = tprice;
	}

}