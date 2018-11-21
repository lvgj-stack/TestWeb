package com.service.impl;

import java.sql.SQLException;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domain.user;
import com.service.UserService;

public class UserServiceImpl implements UserService {

	public boolean cheakLogin(String username, String password) throws SQLException {
		
		UserDao user = new UserDaoImpl();
		
		
		return user.cheakLogin(username, password);
	}

	@Override
	public boolean doRegester(String username, String password, String usercode) throws SQLException {
		
		UserDao user = new UserDaoImpl();
		return user.doRegester(username, password, usercode);
	}

	@Override
	public boolean checkUserName(String username) throws SQLException {
		UserDao user = new UserDaoImpl();
		
		return user.checkUserName(username);
	}

	@Override
	public user getUserId(String username) throws SQLException {
		
		UserDao user = new UserDaoImpl();

		return user.getUserId(username);
	}

}
