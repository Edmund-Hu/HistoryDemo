package com.Edmund_7_27;

public class String_test {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		s.append("fh");

		String s1= new String("abc");
		String s2= new String("abc");//s1==s2?  false
		String s3= "abc";// s3==s1? false
		String s4="a"+"bc";//s3==s4? true
	}

}
