package com.Edmund_Homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class StringTest {
	
	public static void alpha(){
		final String a="asdfa";

		return;
		//System.out.println("Œ“¿¥¿≤");
	}
		void beta(){
			alpha();
		}
		

	public static void main(String[] args) {
		String s1="http(s)+";
		String s2="https";
		System.out.println(s2.matches(s1));
		   test("four");
           test("tea");
           test("to");
      
                   //  Double i = new Double(12.3);
                    // double j = 12.3;
                     
          // Integer j=127;
                   //  Integer i=127;
                    Integer m=new Integer(12);
                    //System.out.println("It is"+(j == i)+"that j==i");
             Date date=new Date();
          date.setTime(date.getTime()+24*60*60*1000);
             System.out.println( date);
            //
    /*         String str = "LEA";
             Deque<Character> stack = new LinkedList<Character>();
             for(int i = 0;i<str.length();i++){
                stack.push(str.charAt(i));
             }
             stack.pop();      stack.pop();      stack.pop();
            System.out.println(stack.peek());

            List<String> list = new ArrayList();
            String arr[]={"one","two","three","four","five","six"};
            for(int i=0;i<arr.length;i++){
            	list.add(arr[i]);
            }
            list.set(4,list.set(3,list.get(1)));
            System.out.println(list.set(3,list.get(1)));
            System.out.println(list);*/
 
            
            Map<String,Integer> map = new HashMap<String,Integer>();
            map.put("g1",50);    map.put("g2",100);    map.put("g3",200);
            Set<Map.Entry<String,Integer>> set = map.entrySet();
            for(Map.Entry<String,Integer> per : set){
                System.out.println(per.getKey()+":"+per.getValue());
            }
            
           String s11="wangfeng";
           String s12="feng";
           String s13= new String("wangfeng");
         //s11= s11.intern();
          s13=s13.intern();
           System.out.println(s11.regionMatches(4, s12, 0, 4));
           System.out.println(s13.toString());
           System.out.println(s11==s13);
           	Deque dq= new LinkedList();
           	Stack st=new Stack();
           	
          
             
            
             
	}

	
	
          public static void test(String str){
              int check = 3;
              if(check == str.length()){
                  System.out.print(str.charAt(check -= 1)+",");
              }else{
                  System.out.print(str.charAt(0)+",");
              }
           }
        
          public class A{
        		 protected int method (int a, int b) {
        			 return 0;
        		 }
        		 
        		 protected long method (int a) {
        			 return 0l;
        		 }
        	 }
        	class B extends A{
        		private Long method(int a,long b){
        			return 0l;
        		}
        	}  
           
       

}
