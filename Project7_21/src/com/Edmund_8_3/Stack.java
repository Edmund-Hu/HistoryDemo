package com.Edmund_8_3;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Stack {
	LinkedList<String> lklist=new LinkedList<>();
	public void add(String s){
		lklist.addLast(s);
	}
	public void remove(){
		lklist.removeLast();
	}
	public void show(){
		Iterator<String> it=lklist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		String s1="111111";
		String s2="222222";
		String s3="333333";
		String s4="444444";
		
		Stack stack= new Stack();
		System.out.println("按照1-2-3-4的顺序放进栈");
		stack.add(s1);
		stack.add(s2);
		stack.add(s3);
		stack.add(s4);
		stack.show();
		System.out.println("从栈里面拿掉4444444");
		stack.remove();
		stack.show();
		System.out.println("后进先出");
		
	}
}
