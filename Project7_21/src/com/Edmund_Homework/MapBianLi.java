package com.Edmund_Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBianLi {
	public static void main(String[] args) {


		  Map<String, String> map = new HashMap<String, String>();
		  map.put("1", "value1");
		  map.put("2", "value2");
		  map.put("3", "value3");
		  
		  //��һ�֣��ձ�ʹ�ã�����ȡֵ
		  System.out.println("ͨ��Map.keySet����key��value��");
		  for (String key : map.keySet()) {
		   System.out.println("key= "+ key + " and value= " + map.get(key));
		  }
		  
		  System.out.println("ͨ��Map.keySet�͵���������");
		  Iterator<String> it= map.keySet().iterator();
		  while(it.hasNext()){
			 String  kk=it.next();
			  System.out.println("key="+kk+" and value="+map.get(kk));
		  }
		 
		  //�ڶ���
		  System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
		  Iterator <Map.Entry<String, String>> it2=map.entrySet().iterator();
		  while(it2.hasNext()){
			  Map.Entry<String, String> SS=it2.next();
			  System.out.println("key ="+SS.getKey()+" and value="+SS.getValue());
		  }
		  
		  
		  //�����֣��Ƽ���������������ʱ
		  System.out.println("ͨ��Map.entrySet����key��value");
		  for (Map.Entry<String, String> entry : map.entrySet()) {
		   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		  }

		  //������
		  System.out.println("ͨ��Map.values()�������е�value�������ܱ���key");
		  for (String v : map.values()) {
		   System.out.println("value= " + v);
		  }
		 }

}
