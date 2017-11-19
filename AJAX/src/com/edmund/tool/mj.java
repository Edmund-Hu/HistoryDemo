package com.edmund.tool;

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

import com.edmund.entity.*;






public class mj {
	public  final static String URL = "jdbc:mysql://localhost:3306/";
	public final static String DRIVER = "com.mysql.jdbc.Driver";
	public final static String USER="root";
	public  final static String PW = "root";
	public  final static String IP = "192.168.1.115";
	public  static PreparedStatement pstmt;
	public  static	Connection conn;
	 public static	ResultSet rs;
	 
	 public static void dConn(){
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL+"bbs",USER,PW);
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
	 
	 //查询总页数
	 public static int getTotalPage(int pageSize){
		 mj.dConn();
		 String sql="select count(id) from message where status=0;";
		 mj.pstmt = null;
		 mj.rs= null;
		 int totalPage = 0;
		 try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.rs = mj.pstmt.executeQuery();
			while(mj.rs.next()){
				
				
				totalPage = (int)Math.ceil((double)mj.rs.getInt(1)/pageSize);
			}
			return  totalPage;
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("查询总页数失败");
			//e.printStackTrace();
			return  totalPage;
		}finally{
			mj.close();
		}
	 }
	 
	 
	 public static String PWcache(String password){
			mj.dConn();
			String pw=null;
			try {
				String sql="insert into cache value('test',password("+password+"))";
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.pstmt.executeUpdate();
				String sql2="select password from cache where username='test' ";
				mj.pstmt=mj.conn.prepareStatement(sql2);
				mj.rs=mj.pstmt.executeQuery();
				while(mj.rs.next()){
					pw=mj.rs.getString(1);
				}
				String sql3="delete from cache where username='test'";
				mj.pstmt=mj.conn.prepareStatement(sql3);
				mj.pstmt.executeUpdate();
			
				return pw;
				
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return null;
			}finally{
				mj.close();
			}

		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static boolean queryExist(String sql,String username){
			mj.dConn();
			String user=null;
			try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
		
				while(mj.rs.next()){
					 user = mj.rs.getString(1);
					 System.out.println(user);
				}
				if(username != null && username.equals(user)){
					return true;
				}else{
					return false;
				}
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 
	 
	 public static boolean insertMsg(String Contents,int userid){
			mj.dConn();
			try {
				String sql="insert into message(userid,message) values("+
			"'"+userid+"','"+Contents+"')";
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 public static boolean insertUser(String username,String password){
			mj.dConn();
			try {
				String sql="insert into userinfo(username,password) values("+
			"'"+username+"',password("+password+"))";
				System.out.println(sql);
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 
	 
	 public static boolean DropMsg(int id){
			mj.dConn();
			try {
				String sql="DELETE FROM message WHERE id ="+"'"+id+"'";		
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 
	 
	 
	 public static boolean modifyMsg(String item,String item2,int condition,String value){
			mj.dConn();
			try {
				String sql="update message set "+item+"='"+value+"' where "+item2+"='"+condition+"'";
				//System.out.println(sql);
				mj.pstmt=mj.conn.prepareStatement(sql);
			
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 public static boolean modifyMsg(String item,String item2,int condition,int value){
			mj.dConn();
			try {
				String sql="update message set "+item+"='"+value+"' where "+item2+"='"+condition+"'";
				//System.out.println(sql);
				mj.pstmt=mj.conn.prepareStatement(sql);
			
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 
	 
	 public static boolean modifyUser(String item,String item2,String condition,String value){
			mj.dConn();
			try {
				String sql="update userinfo set "+item+"= password("+value+") where "+item2+"='"+condition+"'";
				System.out.println(sql);
				mj.pstmt=mj.conn.prepareStatement(sql);
			
				mj.pstmt.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.out.println("显示详情失败");
				e.printStackTrace();
				return false;
			}finally{
				mj.close();
			}

		}
	 
	 
		public static void Showdetail(String sql){
			mj.dConn();
				try {
				mj.pstmt=mj.conn.prepareStatement(sql);
				mj.rs=mj.pstmt.executeQuery();
			
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
	
	
	 
}
