package com.edmund.demo;

 class ClassLoaderTest {
		public static int counter1;
		public static int counter2 = 0 ;
	private static ClassLoaderTest classLoaderTest = new ClassLoaderTest();

	private ClassLoaderTest(){
		counter1++;
		counter2++;
	}
	public static ClassLoaderTest getInstance(){
		return classLoaderTest;
	}
}

