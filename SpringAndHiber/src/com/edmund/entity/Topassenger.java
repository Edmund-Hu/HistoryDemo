package com.edmund.entity;

/**
 * Topassenger entity. @author MyEclipse Persistence Tools
 */

public class Topassenger implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Passenger passenger;

	// Constructors

	/** default constructor */
	public Topassenger() {
	}

	/** full constructor */
	public Topassenger(User user, Passenger passenger) {
		this.user = user;
		this.passenger = passenger;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passenger getPassenger() {
		return this.passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}