package com.Edmund_7_22;

public class Zuoye5 {
//��ʮ�ġ���ӡ��쳲��������е�ǰ20�1��1��2��3��5��8........����һ�����ǰ����֮��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=1;
		int a;
		System.out.print(n2+",");
		for(int i=1;i<20;i++){
			a=n1+n2;
			System.out.print(a+",");
			n1=n2;
			n2=a;
			
		}
	}

}
