package com.Edmund_7_28_Shangji;

public class CharArray {
	private static int charPerLine = 5;//��̬������ÿ����ʾ���ַ���,Ĭ��5��
	private char[] words;    //ʵ���������ַ�����
	
	public CharArray(char[] words){  //���췽��
		this.words = words;
	}
	//��̬����������ÿ����ʾ���ַ���
	public static void setCharPerLine(int cpl){ 
		charPerLine = cpl;
	}
	//��ӡ�ַ����飬ÿ����ʾ���ַ����ɾ�̬����charPerLine����
	public void printArray(){ 
		for(int i=0; i<words.length; i++){
			System.out.print(words[i]);
			if((i+1)%charPerLine==0 || i==words.length-1){
				System.out.println();
			}
		}
		System.out.println();
	}
	public void sort(){  //���������ð������
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
		//CharArray c1 = new CharArray(arr);  //��1��CharArrayʵ��
		//c1.printArray(); 	//ÿ����ʾĬ��5���ַ�
		
		//CharArray.setCharPerLine(7);  //��������ÿ����ʾ���ַ���
		//c1.printArray();	 //ÿ����ʾ7���ַ�
		
		CharArray c2 = new CharArray(arr);   //��2��CharArrayʵ��
		c2.sort();			//�������򷽷�
		c2.printArray();    //ÿ����ʾ7���ַ�����̬������ͬ��ʵ������
		System.out.println(c2.binarySearch('d'));
	}

}
