package com.Edmund_Homework;

public class Circle {
	private String location;
	private Double r;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getR() {
		return r;
	}
	public void setR(Double r) {
		this.r = r;
	}
	public double area(double r){
		return 3.1415926*r*r;
	}
	
	public static void main(String[] args) {
		Circle cr=new Circle();
		System.out.println(cr.area(10));
	}
}
