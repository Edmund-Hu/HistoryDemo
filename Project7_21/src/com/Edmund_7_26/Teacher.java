package com.Edmund_7_26;

public class Teacher {
	private String name;
	private int teachAge;
	private String lesson;
	private String major;

	public Teacher(String name, int teachAge, String lesson,
			 String major) {
		this.name = name;
		this.teachAge = teachAge;
		this.lesson = lesson;
		this.major = major;
	};
	
	public void selfInstruction() {
		System.out.println("��Һã��ҽ�" + name + "," + "����" + teachAge + "�����," +
				   "�ҵ�����רҵ��" + major+"�����ڿγ���"+lesson);
	}
	
	public void getStudentinfo(){
		Student a = new Student("����˧", 12,"5��5��", "XXСѧ", "XXרҵ");
		a.selfInstruction();
		
	}
}


