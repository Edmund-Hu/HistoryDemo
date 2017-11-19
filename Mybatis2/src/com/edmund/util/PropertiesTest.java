package com.edmund.util;

import java.util.ResourceBundle;

public class PropertiesTest {
	
	public static void main(String[] args) {
		try {
			ResourceBundle cache = ResourceBundle.getBundle("jdbc");
			System.out.println(cache.getString("jdbc.driver"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
