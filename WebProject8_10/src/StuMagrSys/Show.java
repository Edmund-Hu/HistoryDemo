package StuMagrSys;

import java.sql.SQLException;

import com.Edmund_8_11.mj;
import com.sun.crypto.provider.RSACipher;
import com.sun.org.apache.regexp.internal.recompile;

public class Show {
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
			System.out.println("œ‘ æœÍ«È ß∞‹");
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
			System.out.println("œ‘ æœÍ«È ß∞‹");
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
			System.out.println("≤È—ØœÍ«È ß∞‹");
			e.printStackTrace();
			return false;
		}finally{
			mj.close();
		}

	}
	
	
	 
}
