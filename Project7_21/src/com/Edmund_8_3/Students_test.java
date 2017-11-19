package com.Edmund_8_3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Students_test {
	public static void main(String[] args) {
		Student s1= new Student(101, "Íõ·å", 250);
		Student s2= new Student(102, "ÀîÀ¥", 228);
		Student s3= new Student(103, "ÀîÀ¥", 252);
		Student s4= new Student(104, "·ëË§", 222);
		
		//Tree set 
		Set<Student> treeset= new TreeSet();
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		
		Iterator<Student> it=treeset.iterator();
		while(it.hasNext()){
			Student student=it.next();
			//System.out.print(student.getId());
			//System.out.print(student.getName());
			//System.out.println(student.getScore());
			System.out.println(student);
		}
		
		
		
				
	}
}
