package com.Edmund_8_3;

import java.util.*;


public class NewsDB_ArrayList {
	public static void main(String[] args) {
		NewsTitle newsTitle1= new NewsTitle(8003, "��", "¬��", new Date());
		NewsTitle newsTitle2=new NewsTitle(8002, "�Ϻ��¼�", "Edmund", new Date());
		NewsTitle newsTitle3=new NewsTitle(8001, "�����ֻ�����һ�", "Alex", new Date());
		NewsTitle firstnews = new NewsTitle(8008, "���㵺���й���", "¬��", new Date());
		List<NewsTitle> list=new ArrayList<>();
		list.add(newsTitle1);
		list.add(newsTitle2);
		list.add(newsTitle3);
		
		//����ͷ������
		list.add(0, firstnews);
		list.add(list.size(),firstnews);
		//ɾ�����һ��
		//list.remove(list.size()-1);
		System.out.println("���������ǣ�"+list.size());
		print(list);
		//����
	if(list.contains(newsTitle2)){
		System.out.println("���Ϻ��ı���");
	}else{
		System.out.println("û��");
	}
	
		
		
		
	}
	
	public static void print(List<NewsTitle> list){
		//ArrayList<NewsTitle> list1 =(ArrayList<NewsTitle>)list;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getTitleName());
			//System.out.println(list.get(i).getCreatDate());
		}
	}
	
	/*public static void print(ArrayList<NewsTitle> list){
		//ArrayList<NewsTitle> list1 =(ArrayList<NewsTitle>)list;
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getTitleName());
		}
	}*/
}
