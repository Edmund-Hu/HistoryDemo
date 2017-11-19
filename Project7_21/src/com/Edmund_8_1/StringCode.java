package com.Edmund_8_1;

public class StringCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  String s="清华大学出版社";
	      char a[]=s.toCharArray();  
	      for(int i=0;i<a.length;i++)
	        {  a[i]=(char)(a[i]^'t');    // 异或运算
	        }
	String secret=new String(a);
	System.out.println("密文:"+secret);
	      for(int i=0;i<a.length;i++)
	       {  a[i]=(char)(a[i]^'t');    // 异或运算
	       }
	String code=new String(a);  
	  System.out.println("原文:"+code);
	}

}
}
