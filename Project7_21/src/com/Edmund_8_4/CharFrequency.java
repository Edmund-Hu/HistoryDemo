package com.Edmund_8_4;

public class CharFrequency {
	public static void main(String[] args) {
		// 依次访问字符串里每个字符
		String str = "aabbcccccdeff";
		char[] charArr = new char[str.length()];
		int[] numArr = new int[str.length()];
		int count = 0; // 计数器
		boolean existFlag;
		char cur;
		for (int i = 0; i < str.length(); i++) {
			// 获取当前的字符
			cur = str.charAt(i);
			// 是否存在的标识
			existFlag = false;
			for (int j = 0; j < count; j++) {
				// 通过循环，访问当前已存在的数组，判断当前字符是否存在
				// 如果存在
				if (charArr[j] == cur) {
					// 统计数加1
					numArr[j]++;
					// 设置存在标识为true
					existFlag = true;
				}
			}
			// 如果不存在
			if (existFlag == false) {
				// 记录当前字符
				charArr[count] = cur;
				// 同时设置统计数为1
				numArr[count] = 1;
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(charArr[i] + "字符出现了" + numArr[i] +"次");
		}
	}
}

