package com.Edmund_8_4;

public class CharFrequency {
	public static void main(String[] args) {
		// ���η����ַ�����ÿ���ַ�
		String str = "aabbcccccdeff";
		char[] charArr = new char[str.length()];
		int[] numArr = new int[str.length()];
		int count = 0; // ������
		boolean existFlag;
		char cur;
		for (int i = 0; i < str.length(); i++) {
			// ��ȡ��ǰ���ַ�
			cur = str.charAt(i);
			// �Ƿ���ڵı�ʶ
			existFlag = false;
			for (int j = 0; j < count; j++) {
				// ͨ��ѭ�������ʵ�ǰ�Ѵ��ڵ����飬�жϵ�ǰ�ַ��Ƿ����
				// �������
				if (charArr[j] == cur) {
					// ͳ������1
					numArr[j]++;
					// ���ô��ڱ�ʶΪtrue
					existFlag = true;
				}
			}
			// ���������
			if (existFlag == false) {
				// ��¼��ǰ�ַ�
				charArr[count] = cur;
				// ͬʱ����ͳ����Ϊ1
				numArr[count] = 1;
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(charArr[i] + "�ַ�������" + numArr[i] +"��");
		}
	}
}

