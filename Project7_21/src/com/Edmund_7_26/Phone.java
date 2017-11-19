package com.Edmund_7_26;

import java.util.Scanner;

public class Phone {
	private int price;
	public String contactList[][]=new String[3][2];
	private String model;

	public void initContactLsit() {
		//contactList = new String[3][2];
		contactList[0][0] = "张三";
		contactList[1][0] = "李四";
		contactList[2][0] = "王五";
		contactList[0][1] = "13678903456";
		contactList[1][1] = "15987623134";
		contactList[2][1] = "17789032345";
	}
	public void setContactList(){
		Scanner sc = new Scanner(System.in);
		//contactList = new String[3][2];
		for(int i=0;i<contactList.length;i++){
			for(int j=0;j<contactList[i].length;j++){
				if(j==0){
					System.out.println("请输入姓名");
					contactList[i][0]=sc.next();
				}else{
					System.out.println("请输入电话号码");
					contactList[i][1]=sc.next();
				}
			}
		}
	}

	public String getContactList(String name) {
		int i;
		String a="sorry， can't find it";
		for (i = 0; i < contactList.length; i++) {
			if (contactList[i][0] == name) {
				a=contactList[i][1];
				break;
			}
		}
			return a;
	}

}
