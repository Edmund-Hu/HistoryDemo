package com.Edmund_7_22;

public class Zuoye11 {

	public static void main(String[] args) {
		// ���ʵ�ִ�ӡ��100���ڵ����в��ظ����һ��ʵĹ�������
		int a,b,c;
		boolean flag = true;
		for( a=1;a<=100;a++){
			for(b=a;b<=100;b++){
				for(c=b;c<=100;c++){
					if(a*a+b*b==c*c){
					//�ж�a,b,c���Ƿ�Ϊ�����������Լ��ֻ����1��
						for(int i=a;i>1;i--){
							if(a%i==0 && b%i==0 && c%i==0){
								flag=false;
								break;	
							}else{
								flag=true;
							}	
						}
						if(flag){
							System.out.println(a+"\t"+b+"\t"+c+"\t");
						}
						
					}		
				}
			}
		}
	}
}


