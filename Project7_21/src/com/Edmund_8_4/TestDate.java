package com.Edmund_8_4;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
	TestDate t=new TestDate();
	t.Time();
	}
	public void Time(){
		Date date=new Date();
		String dateS=date.toString();
		String year=String.format("%tY", date);
		String month=String.format("%tB", date);
		String time=dateS.substring(11,19);
		System.out.print(year+month);
		System.out.println(time);
		for(int i=0;i<6;i++){
			System.out.println();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		this.Time();
	}
}
