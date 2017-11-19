package com.Edmund_8_4;

import java.util.Calendar;

public class TestCanlender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("当前时间的年份是："+cal.get(Calendar.YEAR));
		System.out.println("当前时间的月份是："+(cal.get(Calendar.MONTH)+1));
		System.out.println("当前时间的日期是："+cal.get(Calendar.DATE));
		System.out.println("当前时间的小时是："+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("当前时间的分钟是："+cal.get(Calendar.MINUTE));
		System.out.println("当前时间的秒钟是："+cal.get(Calendar.SECOND));
		System.out.println("当前时间的毫秒是："+cal.get(Calendar.MILLISECOND));
		//System.out.println(cal.get(Calendar.SUNDAY));
	}
}
