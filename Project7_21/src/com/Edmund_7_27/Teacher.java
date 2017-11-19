package com.Edmund_7_27;

public class Teacher {
	private String name;
	private String school;
	public Teacher(String name,String school){
		this.name =name;
		this.school = school;
	}
	
	public void giveLesson(){
		System.out.println("讲解知识点");
		System.out.println("总结提问");
	}
	
	public void intruction(){
		System.out.println("我是"+name+"我在"+school+"上班"); 
	}
	
}
