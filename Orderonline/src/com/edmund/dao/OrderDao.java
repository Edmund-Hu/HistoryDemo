package com.edmund.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.edmund.entity.Order;

@Repository("orderDao")
public class OrderDao {
	@Resource
	public DataSource dataSource;
	
	@Resource
	public JdbcTemplate jdbcTemplate;
	
	public Order gerOrder(String sql,int userId) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Order> list =jdbcTemplate.query(sql, new Object[]{userId},new int[]{java.sql.Types.INTEGER},new OrderRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public Order getOrder(String sql) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Order> list =jdbcTemplate.query(sql,new OrderRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public List<Order> getOrders(String sql) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new OrderRowMapper());
	}
	
	public boolean insertOrder(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 	
	}
	
	
	public boolean updateOrder(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 	
	}
}
