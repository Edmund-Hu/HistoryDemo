package com.Edmund_7_28_Shangji;

public class Point {
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int a) {
		this.x = a;
	}
	public int getY() {
		return y;
	}
	public void setY(int b) {
		this.y =b;
	}
	
	public void show(){
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	public static void main(String[] args) {
		Point p= new Point();
		p.show();
		p.setX(3);
		p.setY(5);
		p.show();
		
		Point2 p2= new Point2(2,5);
		p2.show();
		
	}
}
