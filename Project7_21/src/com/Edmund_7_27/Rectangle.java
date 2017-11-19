package com.Edmund_7_27;

import java.math.BigDecimal;
import java.text.NumberFormat;

import com.Edmund_7_26.Cube;

public class Rectangle {
	double length;
	double width;
	
	public void setlength(double length){
		this.length=length;
	}
	
	public void setwidth(double width){
		this.width=width;
	}
	
	public void draw(){
		for(int i=1;i<=this.width;i++){
			for(int j=1;j<=this.length;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public int calArea(){
		return (int)(length*width);
	}
	public int calPerimeter(){
		return (int)(length+width)*2;
	}
	
	public double calDiagonal(int precision){
		double a= Math.sqrt(length*length+width*width);
		return (double)(Math.round(a*Math.pow(10, precision)))/Math.pow(10, precision);
	}
	
	
	public static void main(String[] args) {
		Rectangle R= new Rectangle();
		R.setlength(3);
		R.setwidth(2);
		R.draw();
		System.out.println(R.calDiagonal(2));
	
		
		
	}
	
}
