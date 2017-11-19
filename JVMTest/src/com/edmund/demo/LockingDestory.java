package com.edmund.demo;

public class LockingDestory {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<2000000;i++){
			createStringBuffer("JVM","Diank");
		}
		long bufferCost= System.currentTimeMillis()-start;
		System.out.println("createStringBuffer:"+bufferCost+"ms");
	}
	public static String createStringBuffer(String s1, String s2){
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s2);
		return sb.toString();
	}
}
