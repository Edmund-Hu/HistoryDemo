package com.Edmund_8_1;

public class StringCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  String s="�廪��ѧ������";
	      char a[]=s.toCharArray();  
	      for(int i=0;i<a.length;i++)
	        {  a[i]=(char)(a[i]^'t');    // �������
	        }
	String secret=new String(a);
	System.out.println("����:"+secret);
	      for(int i=0;i<a.length;i++)
	       {  a[i]=(char)(a[i]^'t');    // �������
	       }
	String code=new String(a);  
	  System.out.println("ԭ��:"+code);
	}

}
}
