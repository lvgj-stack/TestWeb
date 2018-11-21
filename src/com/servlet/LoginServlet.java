package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.domain.user;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.util.JDBCUtil2;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		
		
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//System.out.println("--------------"+username+password);
			request.getSession().setAttribute("name", username);
			UserService issuccess = new UserServiceImpl();
			System.out.println(issuccess.cheakLogin(username, password));
			response.getWriter().print(issuccess.cheakLogin(username, password));
			request.getSession().setAttribute("isSuccess", issuccess.cheakLogin(username, password));
			/*if(issuccess.cheakLogin(username, password)){
				//response.getWriter().write("success login!");
				response.sendRedirect("successpage.jsp");
			}else{

				response.sendRedirect("loginfailpage.jsp");
				//response.getWriter().write("failed login!");
			}*/
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
