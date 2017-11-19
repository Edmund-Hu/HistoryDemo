package com.Edmund.toollib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import StuMagrSys.PrintTitle;
import StuMagrSys.Students;


public class mj {
	public  final static String URL = "jdbc:mysql://localhost:3306/";
	public final static String DRIVER = "com.mysql.jdbc.Driver";
	public final static String USER="root";
	public  final static String PW = "root";
	public  static PreparedStatement pstmt;
	public  static	Connection conn;
	 public static	ResultSet rs;
	 
	 public static void dConn(){
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL+"student",USER,PW);
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
		//2.通过DriverManager获得连接
		catch (SQLException e) {
			System.out.println("建立连接失败或者SQL语句问题");
			e.printStackTrace();
		}
		
	 }
	 
	 public static void dConn(String database){
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL+database,USER,PW);
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
		//2.通过DriverManager获得连接
		catch (SQLException e) {
			System.out.println("建立连接失败或者SQL语句问题");
			e.printStackTrace();
		}
		
	 }
	 
	 public static void close(){
		 try {
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
				}
			if(conn!=null){
				conn.close();
				}
			
		} catch (SQLException e) {
			System.out.println("关闭失败！");
			e.printStackTrace();
		}
		 
	 }
	 
	 public static void Showdetail(){
			mj.dConn();
			String sql="select * from stu";
			try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
				PrintTitle.title();
				while(mj.rs.next()){
					System.out.print(mj.rs.getInt(1)+"\t");
					System.out.print(mj.rs.getString(2)+"\t");
					System.out.print(mj.rs.getString(3)+"\t");
					System.out.print(mj.rs.getInt(4)+"\t");
					System.out.println(mj.rs.getDouble(5)+"\t");
				}
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
			}finally{
				mj.close();
			}
			
		}
		public static void Showdetail(String sql){
			mj.dConn();
				try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
				PrintTitle.title();
				while(mj.rs.next()){
					System.out.print(mj.rs.getInt(1)+"\t");
					System.out.print(mj.rs.getString(2)+"\t");
					System.out.print(mj.rs.getString(3)+"\t");
					System.out.print(mj.rs.getInt(4)+"\t");
					System.out.println(mj.rs.getDouble(5)+"\t");
				}
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
			}finally{
				mj.close();
			}
		
		}
		
		
		public static boolean Sheach(String sql){
				mj.dConn();
				try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
				if(mj.rs.next()){
					return true;
				}else{
					return false;
				}			
			} catch (SQLException e) {
				System.out.println("查询详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
		@SuppressWarnings("finally")
		public static List<Map<String,Object>> executeQuery(String sql){
			List<Map<String,Object>> list=null;
			mj.dConn();
			try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
				ResultSetMetaData rsmd=mj.rs.getMetaData();//对象的编号、类型和属性；
				int count =rsmd.getColumnCount();//rs结果集的列数；
				list = new ArrayList<Map<String,Object>>();
				//遍历ResultSet
				while(rs.next()){
					Map<String,Object> map = new HashMap<String,Object>();
					for(int i=0 ;i<count;i++){
						String key=rsmd.getColumnName(i+1);
						Object value=rs.getObject(i+1);
						map.put(key, value);
					}
					list.add(map);
				}
				//return list;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				mj.close();
				return list;
			}
			
		}
			
		
		
	
		
		
		public static void update(String sql,Object[] obj){
			mj.dConn();
			try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				for(int i=1;i<=obj.length;i++){
					mj.pstmt.setObject(i, obj[i-1]);
				}
				mj.pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("更新失败！");
				e.printStackTrace();
			}finally{
				mj.close();
			}
			
		}
		
		public static void main(String[] args) {
			String sql="insert into stu(name,age ,score,sex) values(?,?,?,?)";
			String sql2=" delete from stu where id in(?,?)";
			String sql3="update stu set name=? where id=?";
			
			Object[] obj={"Henry",30,45,"m"};
			Object[] obj2={8,9};
			Object[] obj3={"王五",10};
			mj.update(sql3,obj3);
			mj.Showdetail();
			
		}
	 
}
