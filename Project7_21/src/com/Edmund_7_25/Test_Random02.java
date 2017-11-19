package com.Edmund_7_25;

import java.util.Random;
import java.util.Scanner;

public class Test_Random02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		//把名单放到数组中
		String[] name = {"黄俊峰", "邓忠", "李昆", "刘洪林", "王扬帆", "胡德鹏",
				"何青霖", "杨世杰", "黄治川", "魏巍", "汪孝海", "尤跃", "侯博", "徐朝成", "谯嘉逸", "熊伟",
				"王元东", "陈世文", "李永潇", "陈军先", "张继丰", "何祥源", "邓炜", "陈华华", "卢旭", "黄刚",
				"王培", "聂常作", "熊杨盼", "余靖", "马良", "寇含尧", "冯帅", "熊国栋", "张伟", "邓盛豪",
				"刘绍林"};
		//System.out.println(name.length);
		int num[] = new int[36];
		int numseve[] = new int[36];
		int i = 0;
		boolean flag = true;
		int count = 1;
		System.out.println("随机名单抽取启动。。。。");
		while(flag){
			if(count>36){
				System.out.println("第一轮抽名单结束");
				flag = false;
			}else{
			int flag1 = 1;
			Random random = new Random();//获取随机变量
			int num1 = random.nextInt();//得到一个随机数
			int num2 = Math.abs(num1);//把随机数变成一个正数
			int num3 = num2%37;//把随机数变成0-36之间
			
			
			for(int j = 0;j<numseve.length;j++){
				if(num3 ==numseve[j]){
					flag1 = 0;
					break;
				}
			}
			if(flag1 ==0){
				continue;
			}else{
				numseve[i] = num3;
				i++;
				count++;
			}
			
			System.out.println("恭喜："+name[num3]+" 成员抢答成功");
			System.out.println("请问要继续么？y/n");
			answer = sc.next();
			if(!answer.equalsIgnoreCase("y")){
				flag = false;
				System.out.println("名单抽取结束！！！！");
				//break;
			}
			//System.out.println(num3);
			//System.out.println(name[num3]);
		}
		}
	}
}
