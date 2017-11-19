package com.edmund.demo;

public class CanReliveTest {
	public static void main(String[] args) throws InterruptedException {
		CanReliveObj.obj = new CanReliveObj();
		CanReliveObj.obj=null;//   可复活
		System.gc();
		Thread.sleep(1000);
		if(CanReliveObj.obj==null){
			System.out.println("Obj is null");
		}else{
			System.out.println("Obj is avaliable");
		}
		System.out.println("第二次GC");
		CanReliveObj.obj=null;
		System.gc();
		Thread.sleep(1000);
		if(CanReliveObj.obj==null){
			System.out.println("Obj is null");
		}else{
			System.out.println("Obj is avaliable");
		}
		
	}
}
