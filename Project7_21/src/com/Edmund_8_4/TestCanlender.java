package com.Edmund_8_4;

import java.util.Calendar;

public class TestCanlender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("��ǰʱ�������ǣ�"+cal.get(Calendar.YEAR));
		System.out.println("��ǰʱ����·��ǣ�"+(cal.get(Calendar.MONTH)+1));
		System.out.println("��ǰʱ��������ǣ�"+cal.get(Calendar.DATE));
		System.out.println("��ǰʱ���Сʱ�ǣ�"+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("��ǰʱ��ķ����ǣ�"+cal.get(Calendar.MINUTE));
		System.out.println("��ǰʱ��������ǣ�"+cal.get(Calendar.SECOND));
		System.out.println("��ǰʱ��ĺ����ǣ�"+cal.get(Calendar.MILLISECOND));
		//System.out.println(cal.get(Calendar.SUNDAY));
	}
}
