package com.Edmund_8_4;

import java.util.Arrays;
import java.util.Random;


public class RondomNum {
	  public static void main(String[] args) {
	        Random r = new Random(); // ����ʵ�����������
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
	        	 
	            //data[i] = r.nextInt(10); // ����0-9֮��������
	            //�ۼ����
	        }
	        System.out.println("��������У�" + Arrays.toString(data));
	        System.out.println("�����֮�ͣ�" + sum);
	        Arrays.sort(data);
	        System.out.println("��������У�" + Arrays.toString(data));
	    }

}
