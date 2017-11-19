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
		System.out.println("大家好，我叫" + name + "," + "今年" + teachAge + "年教龄," +
				   "我的主修专业是" + major+"我主授课程是"+lesson);
	}
	
	public void getStudentinfo(){
		Student a = new Student("长得帅", 12,"5月5号", "XX小学", "XX专业");
		a.selfInstruction();
		
	}
}


