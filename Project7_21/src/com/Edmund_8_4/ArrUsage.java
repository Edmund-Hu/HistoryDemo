package com.Edmund_8_4;

public class ArrUsage {
	public static void main(String[] args) {
		//������������ַ���
        String historyClick = "12,14,16,35";
        String todayClick = "2,4,6,5";
        String[] histories ;
        String[] todays ;
        String tmp = "";
        //��ֵ����
        histories = historyClick.split(",");
        todays = todayClick.split(",");
        //��������
        for (int i = 0; i < histories.length; i++) {
          int click = Integer.parseInt(histories[i]) + Integer.parseInt(todays[i]);
          tmp = tmp + click + "," ; 
        }
        //ȥ�����һ������
        historyClick = tmp.substring(0, tmp.length() - 1);
        //���������
        System.out.println(historyClick);

	}
}

