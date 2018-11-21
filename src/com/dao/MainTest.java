package com.dao;

import java.sql.*;
import com.util.JDBCUtil;

public class MainTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			 conn = JDBCUtil.getConn();
			 st  = conn.createStatement();
			 String sql = "select * from t_user";
			 rs = st.executeQuery(sql);
			 
			 while(rs.next()){
				 String username = rs.getString("username");
				 String password = rs.getString("password");
				 System.out.println(" "+username+" "+password);
				 
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.release(conn, st, rs);
		}
		
	}

}
