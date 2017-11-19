package com.edmund.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edmund.entity.Good;




public class GoodRowMapper implements RowMapper<Good> {

	@Override
	public Good mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		
		Good good = new Good();
		good.setGoodId(rs.getInt(1));
		good.setGoodName(rs.getString(2));
		good.setGoodPic(rs.getString(3));
		good.setGoodPrice(rs.getDouble(4));
		good.setDiscount(rs.getFloat(5));
		good.setStatus(rs.getInt(6));
		good.setGoodcount(rs.getInt(7));
		good.setTaste(rs.getString(8));
		good.setStyle(rs.getString(9));
		good.setSaleTotal(rs.getInt(10));
		good.setRecipe(rs.getString(11));
		good.setPic1(rs.getString(12));
		good.setPic2(rs.getString(13));
		good.setPic3(rs.getString(14));
		return good;
	}

}
