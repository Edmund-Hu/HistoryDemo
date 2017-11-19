package com.edmund.mapper;

import java.util.Map;


import org.apache.ibatis.jdbc.SQL;

public class UserDynamicSQLProvider {
	public String selectProvider(final Map<String,Object> map){
		return new SQL(){
			{
				SELECT("*");
				FROM("user");
				if (map.get("id") != null) {
					WHERE("id=#{id}");
				}
				else if(map.get("name")!=null){
					WHERE("name like #{name}");
				}
			}
			
		}.toString();
	}
}
