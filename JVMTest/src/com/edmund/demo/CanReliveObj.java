package com.edmund.demo;

public class CanReliveObj {
	public static CanReliveObj obj;
	//finalize方法只会被调用一次
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("CanReliveObj finalize called");
		obj = this;
	}
	public String toString(){
		return "I am CanRelive Obj";
	}
}
