package com.dao.impl;

import java.awt.List;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dao.UserDao;
import com.domain.code;
import com.domain.user;
import com.util.JDBCUtil2;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean cheakLogin(String username, String password) throws SQLException {
		QueryRunner queryrunner = new QueryRunner(JDBCUtil2.getDataSource());
		String sql = "select * from userlist where username=? and password=?";
		//获取查询到的人
		user user1 = queryrunner.query(sql, new BeanHandler<user>(user.class),username,password);
		//看是否是空，空的话代表登陆失败
		
		if(user1 != null){
			/*//非空的话还要改变isuse
			String usql = "UPDATE userlist SET isuse=1 WHERE username=?";
			queryrunner.update(usql,username);*/
			return true;
		}else{
			return false;
		}
		
		
		
		
		
		
		
		//return user1 != null;

		
		
	}

	@Override
	public boolean doRegester(String username, String password, String usercode) throws SQLException {
		
		QueryRunner queryrunner = new QueryRunner(JDBCUtil2.getDataSource());
		
		String check_sql = "SELECT * FROM eq_code WHERE usercode=? and isuse=0";
		
//		System.out.println(queryrunner.query(check_sql, new BeanHandler<code>(code.class),usercode)+" --546---");
		if(queryrunner.query(check_sql, new BeanHandler<code>(code.class),usercode) != null){
			String sql = "insert into userlist values(null,?,?,?,?,?)";
//			System.out.println(""+username+password+usercode);
			queryrunner.update(sql,username,password,usercode,null,0);
			queryrunner.update("UPDATE eq_code SET isuse=1 WHERE usercode=?",usercode);
			return true;
		}else{
			return false;
		}
	}

	
	
	@Override
	public boolean checkUserName(String username) throws SQLException {
		
		QueryRunner queryrunner = new QueryRunner(JDBCUtil2.getDataSource());
		
		String sql = "SELECT * FROM userlist WHERE username=?";
		
		return queryrunner.query(sql, new BeanHandler<user>(user.class),username) != null;
		
	}

	@Override
	public user getUserId(String username) throws SQLException {
		
		QueryRunner queryrunner = new QueryRunner(JDBCUtil2.getDataSource());
		
		String sql = "SELECT * FROM userlist WHERE username=?";
		
		return queryrunner.query(sql, new BeanHandler<user>(user.class),username) ;
		
	}
}
