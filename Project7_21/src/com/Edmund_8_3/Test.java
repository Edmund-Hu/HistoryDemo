package com.Edmund_8_3;

import java.util.ArrayList;
import java.util.Date;

import com.Edmund_7_28_Shangji.Employee;

import StuMagrSys.MainPage;

public class Test {
	public static void main(String[] arge){
		NewsTitle news1= new NewsTitle(1, "����", "С��1", new Date());
		NewsTitle news2= new NewsTitle(2, "������", "С��2", new Date());
		NewsTitle news3= new NewsTitle(2, "�㽶", "С��3", new Date());
		ArrayList list = new ArrayList();
		list.add(news1);
		list.add(news2);
		list.add(news3);
		//list.remove(2);
		//�󼯺�Ԫ�ظ���
		System.out.println("����Ԫ�ظ���Ϊ��"+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(((NewsTitle)list.get(i)).getTitleName());
		}
		
		
	}
}
