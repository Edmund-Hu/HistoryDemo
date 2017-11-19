package com.Edmund_8_11;

import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class TestQeury {

	/**<p></p>
	 * @param args
	 */
	public static void main(String[] args) {
	String sql = "Select * from stu";
	List<Map<String,Object>> list =mj.executeQuery(sql);;
	student[] students=	mj.convert(list);
/*	for(Map<String,Object> map:list){
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()){
			String key=it.next();
		
			//System.out.print(key+"\t");
			System.out.print(map.get(key)+"\t");
		}
		System.out.println();
	}*/
	 for(student stu:students){
		 System.out.println(stu);
	 }
		

	}

}
