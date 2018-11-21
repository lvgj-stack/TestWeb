package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.util.JDBCUtil;

public class RegesterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String usercode = request.getParameter("usercode");
		System.out.println(""+username+password+usercode+"------------");
		try {
			UserService userRegester = new UserServiceImpl();
			
			//System.out.println(userRegester.doRegester(username, password, usercode));
			response.getWriter().print(userRegester.doRegester(username, password, usercode));
			
		/*	if(userRegester.doRegester(username, password, usercode)){
				
				//response.getWriter().print("注册成功！");
				request.getRequestDispatcher("middle_left.html").forward(request, response);
			}else{
//			response.getWriter().print("注册失败！");
				response.sendRedirect("registerfail.jsp");
				
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
