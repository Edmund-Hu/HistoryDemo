package com.Edmund_8_3;

import java.util.HashMap;
import java.util.Map;

public class Map_test {

	public static void main(String[] args) {
		Student s1= new Student(101, "����", 250);
		Student s2= new Student(102, "����", 228);
		Student s3= new Student(103, "����", 252);
		Student s4= new Student(104, "��˧", 222);

		Map<String,Student> map=new HashMap<>();
		map.put("firePig", s1);
		map.put("bug", s2);
		map.put("godV", s3);
		map.put("Bigbear", s4);
		System.out.println(map.keySet());
		System.out.println("ֵ��"+map.values());
		System.out.println("��ֵһ��");
		System.out.println(map);
		System.out.println("------------");
		System.out.println("����");
		String key="bug";
		if(map.containsKey(key)){
			System.out.println("�ҵ�bug");	
			System.out.println(map.get(key));
		}else{
			System.out.println("����");
		}
		
	//����ֵ
		if(map.containsValue(s4)){
			System.out.println(s4+"������");
		}
		
		//ɾ
		
		map.remove(key);
		System.out.println(map);
		
		
	}


}
