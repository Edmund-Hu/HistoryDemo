package com.edmund.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edmund.entity.Good;



@Repository("goodDao")
public class GoodDao {
	@Resource
	public DataSource dataSource;
	
	@Resource
	public JdbcTemplate jdbcTemplate;
	
	
	public boolean updateGood(String sql) {
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 
	}

	public Good getGood(String sql,int goodId) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Good> list =jdbcTemplate.query(sql, new Object[]{goodId},new int[]{java.sql.Types.INTEGER},new GoodRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public Good getGood(String sql) {
		// TODO Auto-generated method stub
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Good> list =jdbcTemplate.query(sql,new GoodRowMapper());
		//����û��������ڣ�list��Ϊ�գ�ֱ�ӷ���Null,��������
		if(list.size()!=0){
		return list.get(0);
		}else{
		return null ;
		}
	}
	
	public List<Good> getGoods(String sql) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(sql, new GoodRowMapper());
	}
	
	public boolean insertGood(String sql){
		try {
			jdbcTemplate.execute(sql);	
			return true;
		} catch (Exception e) {
			System.out.println("����ʧ��");
			return false;
		} 	
	}
}
