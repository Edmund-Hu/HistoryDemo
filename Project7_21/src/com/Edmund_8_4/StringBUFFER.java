package com.Edmund_8_4;

public class StringBUFFER {

	public static void main(String[] args) {
		String[] arr={"wish","education","welcome","you"};
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<arr.length;i++){
			sbf.append(arr[i]+" ");
		}
		System.out.println(sbf);
		sbf.delete(5,15);
		System.out.println(sbf);
		sbf.setCharAt(0, 'W');
		sbf.setCharAt(5, 'W');
		sbf.setCharAt(13, 'Y');
		System.out.println(sbf);
	}

}
