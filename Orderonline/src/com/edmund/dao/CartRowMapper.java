package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edmund.entity.Cart;




public class CartRowMapper implements RowMapper<Cart> {


	@Override
	public Cart mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		
		Cart cart = new Cart() ;
		cart.setCartId(rs.getInt(1));
		cart.setUserId(rs.getInt(2));
		cart.setGoodId(rs.getInt(3));
		cart.setCount(rs.getInt(4));
		return cart;
	}

}
