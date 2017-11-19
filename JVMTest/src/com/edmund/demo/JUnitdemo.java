package com.edmund.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitdemo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void printBinary() {
		int a = -6;
	
		for(int i = 0 ;i<32;i++){
			int t = (a & 0x80000000>>>i)>>>(31-i);
			System.out.print(t);
		}
	}
	
	@Test
	public void Memerry() {
		Byte[] bt = new Byte[1*1024*10*10];
		System.gc();
		System.out.print("Xmx=");
		//程序运行使用的最大堆容量 Xmx 
		System.out.println(Runtime.getRuntime().maxMemory()/1024.0/1024+"M");
		System.out.print("Free mem=");
		System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024+"M");
		System.out.print("Total mem=");
		//Xms  最小堆Xms,Java堆至少适应空间
		System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024+"M");
	}
	
	@Test
	public void systemTest(){
		System.getProperties().list(System.out);
	}
	
	@Test
	public void testClassLoader(){
		ClassLoaderTest classLoaderTest = ClassLoaderTest.getInstance();
	System.out.println("counter1="+classLoaderTest.counter1);
	System.out.println("counter2="+classLoaderTest.counter2);
	}
	
	
	

}
