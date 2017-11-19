package com.Edmund_8_4;

import java.util.Arrays;
import java.util.Random;


public class RondomNum {
	  public static void main(String[] args) {
	        Random r = new Random(); // 首先实例化随机对象
	        int sum = 0;
	        int[] data = new int[5];
	        boolean flag=false;
	        for (int i = 0; i < data.length;) {
	        	int temp=r.nextInt(10);
	     
	        	for(int j=0;j<i;j++){
	        		if(data[j]==temp){
	        			flag=true;
	        			break;
	        		}else{
	        			flag=false;
	        		}		
	        	}
	        	if(flag){
	        		continue;
	        	}else{
	        		data[i]=temp;
	        		sum = sum + data[i];
	        		i++;
	        	}
	        	 
	            //data[i] = r.nextInt(10); // 生成0-9之间的随机数
	            //累加求和
	        }
	        System.out.println("随机数序列：" + Arrays.toString(data));
	        System.out.println("随机数之和：" + sum);
	        Arrays.sort(data);
	        System.out.println("排序后序列：" + Arrays.toString(data));
	    }

}
