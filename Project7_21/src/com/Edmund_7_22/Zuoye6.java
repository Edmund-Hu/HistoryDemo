package com.Edmund_7_22;

import java.util.Scanner;

public class Zuoye6 {
	//二十五、接收用户输入两个数，作为x行和y列，打印一个x行y列的#号矩阵
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("请输入行数x和列数y(大于1)");
		int x =SC.nextInt();
		int y = SC.nextInt();
		for(int i=1;i<=x;i++){
			for(int j =1;j<=y;j++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
