package com.service;

import java.sql.SQLException;

import com.domain.user;

public interface UserService {
	/**
	 * 这是用于检验是否登陆成功的Service
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	boolean cheakLogin(String username , String password) throws SQLException;
	/**
	 * 这是用于注册的Service
	 * @param username
	 * @param password
	 * @param usercode 设备码，独一无二
	 * @return 
	 * @throws SQLException
	 */
	boolean doRegester(String username , String password ,String usercode) throws SQLException;
	/***
	 * 用于检查用户名是否存在
	 * @param username
	 * @return
	 * @throws SQLException
	 */
	boolean checkUserName(String username) throws SQLException;
	/**
	 * 
	 * @param username 用户的名字	
	 * @return 该用户的所有信息
	 * @throws SQLException
	 */
	user getUserId(String username) throws SQLException;

}
