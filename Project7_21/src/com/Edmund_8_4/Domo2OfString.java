package com.Edmund_8_4;

public class Domo2OfString {
	public static void main(String[] args) {
		String s = "I am ben. I am ten years old. I can read english.";
	    String sub = "en";
	    System.out.println("原始字符串:\n"+s);
	    System.out.println("第一个a的位置："+s.indexOf("a"));
	    System.out.println("最后一个a的位置："+s.lastIndexOf("a"));
	    System.out.println("从索引位置10开始的第一个a的位置"+s.indexOf("a",10));
	    System.out.println("第一个en的位置："+s.indexOf(sub));
	    //循环查找a的位置
	    int index =0;
	    int n=0;
	    while(index!=-1){
	    	index=s.indexOf("a",index);
	    	if(index!=-1){
	    		System.out.println("第"+(++n)+"个a的位置是"+index);
	    		index++;
	    	}
	    }
	    
	    
	}
}
