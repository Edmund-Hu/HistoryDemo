package com.Edmund_7_28_Shangji;

public class CharArray {
	private static int charPerLine = 5;//静态变量，每行显示的字符数,默认5个
	private char[] words;    //实例变量，字符数组
	
	public CharArray(char[] words){  //构造方法
		this.words = words;
	}
	//静态方法，设置每行显示的字符数
	public static void setCharPerLine(int cpl){ 
		charPerLine = cpl;
	}
	//打印字符数组，每行显示的字符数由静态变量charPerLine决定
	public void printArray(){ 
		for(int i=0; i<words.length; i++){
			System.out.print(words[i]);
			if((i+1)%charPerLine==0 || i==words.length-1){
				System.out.println();
			}
		}
		System.out.println();
	}
	public void sort(){  //对数组进行冒泡排序
		for(int i=0; i<words.length-1; i++){
			for(int j=0; j<words.length-1-i; j++){
				if(words[j] > words[j+1]){
					char t = words[j];
					words[j] = words[j+1];
					words[j+1] = t;
				}
			}
		}
	}
	
	public int binarySearch(char key){
		int high=words.length-1;
		int low=0;
		int mid=(high+low)/2;
		int flag=-1;
		while(low<high){
			mid=(high+low)/2;
			if(key<words[mid]){
				high=mid-1;
			}else if(key==words[mid]){
				flag=mid;
				break;
			}else if(key>words[mid]){
				low=mid+1;	
			}
		}	
		return flag;
	}
	public static void main(String[] args) {
		char[] arr = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
		//CharArray c1 = new CharArray(arr);  //第1个CharArray实例
		//c1.printArray(); 	//每行显示默认5个字符
		
		//CharArray.setCharPerLine(7);  //重新设置每行显示的字符数
		//c1.printArray();	 //每行显示7个字符
		
		CharArray c2 = new CharArray(arr);   //第2个CharArray实例
		c2.sort();			//调用排序方法
		c2.printArray();    //每行显示7个字符，静态变量被同类实例共享
		System.out.println(c2.binarySearch('d'));
	}

}
