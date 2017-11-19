package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.edmund.entity.Cart;

@Repository("cartDao")
public class CartDao {
	@Resource
	public DataSource dataSource;
	
	@Resource
	public JdbcTemplate jdbcTemplate;
	
	public Cart getCart(String sql,int userId) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Cart> list =jdbcTemplate.query(sql, new Object[]{userId},new CartRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public Cart getCart(String sql) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Cart> list =jdbcTemplate.query(sql,new CartRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public List<Cart> getCarts(String sql) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new CartRowMapper());
	}
	
	public boolean insertCart(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 	
	}
	
	
	public boolean updateCart(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 	
	}
	
	
}
