package com.Edmund_8_4;

import java.util.*;
public class Test {
	public static void main(String[] args) {
		ArrayList info = new ArrayList();
		String info1 = "我今年";
		int age = 18;
		String info2 = "岁了";
		info.add(info1);
		info.add(age);
		info.add(info2);
		info.set(1, (Integer) info.get(1) + 1);
		for (int i = 0; i < info.size(); i++) {
			System.out.print(info.get(i));
		}
	}
}

