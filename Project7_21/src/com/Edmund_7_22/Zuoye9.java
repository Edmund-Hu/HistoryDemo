package com.Edmund_7_22;

public class Zuoye9 {
//��ʮ�ˡ���ӡ�����еġ�ˮ�ɻ�����
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
		int a=i%10;
		int b=i/10%10;
		int c=i/100;
		if(a*a*a+b*b*b+c*c*c==i){
			System.out.println(i);
		}
		}

	}

}
