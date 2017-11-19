package StuMagrSys;

import java.sql.SQLException;

import com.Edmund_8_11.mj;

public class Delete {
	public static  void del(String sql){
		mj.dConn();
		try {
			mj.pstmt=mj.conn.prepareStatement(sql);
			mj.pstmt.executeUpdate();
			System.out.println("É¾³ý³É¹¦£¡");
			
		} catch (SQLException e) {
			System.out.println("É¾³ýÊ§°Ü");
			e.printStackTrace();
		}finally{
			mj.close();
		}
	}
}
