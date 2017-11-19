package com.Edmund_8_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
	private String pattren = "yyyy.MM.dd";
	public DateTools(String pattren){
		this.pattren = pattren;
	}
	private SimpleDateFormat format = new SimpleDateFormat(pattren);
	public String dateToString(Date date){
		return format.format(date);
	}
	public Date stringToDate(String date){
		try {
			return format.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		DateTools dt=new DateTools("yyyy.MM.dd");
		String dateString="2016.08.04";
		Date date=new Date();
		System.out.println(dt.stringToDate(dateString));
		System.out.println(dt.dateToString(date));
	}
}
