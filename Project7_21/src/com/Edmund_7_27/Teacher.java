package com.Edmund_7_27;

public class Teacher {
	private String name;
	private String school;
	public Teacher(String name,String school){
		this.name =name;
		this.school = school;
	}
	
	public void giveLesson(){
		System.out.println("����֪ʶ��");
		System.out.println("�ܽ�����");
	}
	
	public void intruction(){
		System.out.println("����"+name+"����"+school+"�ϰ�"); 
	}
	
}
