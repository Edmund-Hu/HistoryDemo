package com.Edmund_7_22;

public class Zuoye11 {

	public static void main(String[] args) {
		// 编程实现打印出100以内的所有不重复并且互质的勾股数。
		int a,b,c;
		boolean flag = true;
		for( a=1;a<=100;a++){
			for(b=a;b<=100;b++){
				for(c=b;c<=100;c++){
					if(a*a+b*b==c*c){
					//判断a,b,c的是否为互质数，最大公约数只能是1；
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


