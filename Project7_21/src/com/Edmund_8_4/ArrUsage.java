package com.Edmund_8_4;

public class ArrUsage {
	public static void main(String[] args) {
		//描述点击量的字符串
        String historyClick = "12,14,16,35";
        String todayClick = "2,4,6,5";
        String[] histories ;
        String[] todays ;
        String tmp = "";
        //拆分点击量
        histories = historyClick.split(",");
        todays = todayClick.split(",");
        //点击量求和
        for (int i = 0; i < histories.length; i++) {
          int click = Integer.parseInt(histories[i]) + Integer.parseInt(todays[i]);
          tmp = tmp + click + "," ; 
        }
        //去掉最后一个逗号
        historyClick = tmp.substring(0, tmp.length() - 1);
        //最后输出结果
        System.out.println(historyClick);

	}
}

