package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import net.sf.json.JSONArray;

import org.springframework.jdbc.core.RowMapper;


import com.edmund.entity.Order;

public class OrderRowMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		
		Order order = new Order();
		order.setOrderId(rs.getInt(1));
		order.setUserId(rs.getInt(2));
		String str = rs.getString(3);
		JSONArray json = JSONArray.fromObject(str);
	
		order.setGoodinfo(json);
		String time = rs.getString(4);
		String ntime = time.substring(0,19);
		order.setTime(ntime);
		order.setStatus(rs.getString(5));
		order.setTotalmoney(rs.getString(6));
		return order;
	}

}