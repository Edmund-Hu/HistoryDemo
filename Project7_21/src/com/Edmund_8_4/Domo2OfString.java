package com.Edmund_8_4;

public class Domo2OfString {
	public static void main(String[] args) {
		String s = "I am ben. I am ten years old. I can read english.";
	    String sub = "en";
	    System.out.println("ԭʼ�ַ���:\n"+s);
	    System.out.println("��һ��a��λ�ã�"+s.indexOf("a"));
	    System.out.println("���һ��a��λ�ã�"+s.lastIndexOf("a"));
	    System.out.println("������λ��10��ʼ�ĵ�һ��a��λ��"+s.indexOf("a",10));
	    System.out.println("��һ��en��λ�ã�"+s.indexOf(sub));
	    //ѭ������a��λ��
	    int index =0;
	    int n=0;
	    while(index!=-1){
	    	index=s.indexOf("a",index);
	    	if(index!=-1){
	    		System.out.println("��"+(++n)+"��a��λ����"+index);
	    		index++;
	    	}
	    }
	    
	    
	}
}
