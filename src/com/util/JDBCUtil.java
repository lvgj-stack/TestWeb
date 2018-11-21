package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	static String url=null;
	static String name = null;
	static String password = null;
	static String driverclass = null;
	
	static{
		try {
			Properties properties = new Properties();
//			InputStream is = new FileInputStream("jdbc.properties");
			InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			properties.load(is);
			driverclass = properties.getProperty("driverclass");
			name = properties.getProperty("name");
			password = properties.getProperty("password");
			url = properties.getProperty("url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		Connection conn = null;
		try {	
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void release(Connection conn,Statement st,ResultSet rs){
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}
	
	private static void closeRs(ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			rs=null;
		}
	}
	
	private static void closeSt(Statement st){
		try {
			if(st!=null){
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			st=null;
		}
	}
	
	private static void closeConn(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			conn=null;
		}
	}
}
