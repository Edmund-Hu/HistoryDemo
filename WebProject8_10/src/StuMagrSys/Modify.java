package StuMagrSys;

import java.sql.SQLException;

import com.Edmund_8_11.mj;

public class Modify {
	public static void modify(String sql){
		mj.dConn();
		try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.pstmt.executeUpdate();
		
			
		} catch (SQLException e) {
			System.out.println("ÐÞ¸ÄÊ§°Ü"+sql);
			e.printStackTrace();
		}finally{
			mj.close();
		}
	
	}
}
