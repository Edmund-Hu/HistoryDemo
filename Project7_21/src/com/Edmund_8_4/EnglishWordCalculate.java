package com.Edmund_8_4;


import java.util.*;

public class EnglishWordCalculate {

	public static void main(String[] args) {
		String paragraph = "You may well have heard of  Zapata Racing, the company which made all of our childhood Back to the Future dreams come to life with its jet-powered hoverboard, the Flyboard Air."
				+"Well, it’s currently in the process of being acquired by a major defense technology company called Implant Sciences, which specializes in developing technology for the Department of Homeland Security and other clients.of";
		String par[] = paragraph.split(", |\\.|\\?|!| ");
	
		HashMap<String,Integer> parmap=new HashMap();
		for(int i=0;i<par.length;i++){
		parmap.put(par[i], 1);
		}	
		//System.out.println(parmap.keySet());
		
		for(int i=0;i<par.length;i++){
			int count=0;
			for(int j=0;j<par.length;j++){
				if(par[i].equals(par[j])){
					count++;
				}
			}
			parmap.put(par[i], count);
		}
		
		//System.out.println(parmap);
		
	 Integer[] a = parmap.values().toArray(new Integer[parmap.values().size()]);
	 String[] b=parmap.keySet().toArray(new String[0]);
	/* for(String x:b){
		 System.out.print(x+"-");
	 }*/
	 
	 //Arrays.sort(a);
	 int max=a[0];
	for(int i=1;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	//System.out.println(max);
	for(int i=0;i<a.length;i++){
	if(a[i]==max){
		System.out.println("出现次数最多的单词为："+b[i]+"共"+max+"次");
		}
	}
	}

}
