package com.edmund.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.edmund.tool.mj;
import com.edmund.web.Message;


public class MessageDao {
	
	 public static Message[] getMessages(String sql){
		List<Map<String,Object>> list=mj.executeQuery(sql);
				Message[] msg =new Message[list.size()];
				for(int i=0;i<list.size();i++){
					msg[i] = new Message();
					msg[i].setId((Integer)(list.get(i).get("id")));
					msg[i].setUsername((String)(list.get(i).get("username")));
					msg[i].setMessage((String)(list.get(i).get("message")));
					String time = (list.get(i).get("inserttime")).toString();
					String newtime = time.substring(0,19);
					msg[i].setInserttime(newtime);
				}
				return msg;
			
		}
	 

		
		 
	
		 
	 
	 
	 
	 
	 
	 
	
	 
	
	
}
