package com.Edmund_7_26;

public class Student {
	private String name;
	private int age;
	private String birthdate;
	private String graduateSchool;
	private String major;

	public Student(String name, int age, String birthdate,
			String graduateSchool, String major) {
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.graduateSchool = graduateSchool;
		this.major = major;
	};
	
	public void selfInstruction() {
		System.out.println("��Һã��ҽ�" + name + "," + "����" + age + "��," + "�ұ�ҵ��"
				+ graduateSchool + "," + "�ҵ�����רҵ��" + major);
	}
	
	public void getfather(){
		System.out.println(this.getClass().getSuperclass().getName());
	}



}
