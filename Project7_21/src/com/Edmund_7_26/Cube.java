package com.Edmund_7_26;

public class Cube {
	double lenght;
	double width;
	double height;
	public double areaButtom(double lenght,double width){
		return lenght*width;
	}
	public double volume(double lenght,double width,double height){
		return lenght*width*height;
	}
	public double areaSurface(double lenght,double width,double height){
		return (lenght*width+lenght*height+width*height)*2;
	}
	public double lenghtofDuijiaoxian(double lenght,double width,double height){
		return Math.sqrt(lenght*lenght+width*width+height*height);
	}
	
	public static void main(String[] args) {
		double lenght=2;
		double width=2;
		double height=2;
		Cube a = new Cube();
		System.out.println(a.areaButtom(lenght, width));
		System.out.println(a.volume(lenght, width, height));
		System.out.println(a.areaSurface(lenght, width, height));
		System.out.println(a.lenghtofDuijiaoxian(lenght, width, height));
		
	}
	
}
