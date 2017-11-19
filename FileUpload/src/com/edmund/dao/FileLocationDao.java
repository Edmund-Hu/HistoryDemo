package com.edmund.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edmund.tool.mj;

public class FileLocationDao {
	
	public String getPath(String fileName){
		mj.dConn();
		String sql ="select * from fileLocation where filename=? ";
		String path = null;
		try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.pstmt.setString(1,fileName);
			mj.rs=mj.pstmt.executeQuery();
			while(mj.rs.next()){
				path = mj.rs.getString(2);
			}
			return path;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return path;
		}finally{
			mj.close();
		}
		
	}
	
	
	public boolean setPath(String fileName){
		mj.dConn();
		String sql ="insert into fileLocation(filename) values('"+fileName+"')";
		//System.out.println(sql);
		try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.pstmt.executeUpdate();
		
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public List<String> getPaths(){
		mj.dConn();
		String sql ="select * from fileLocation";
		List<String> list =new ArrayList<>();
		try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.rs=mj.pstmt.executeQuery();
			while(mj.rs.next()){
				
				list.add(mj.rs.getString(2));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return list;
		}finally{
			mj.close();
		}
		
	}
	
	
	
}
