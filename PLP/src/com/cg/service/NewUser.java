package com.cg.service;
import com.cg.bean.*;
import com.cg.dao.NewUserDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewUser extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		UserBean bean=new UserBean();
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String role=req.getParameter("role");
		bean.setUserName(uname);
		bean.setPassWord(pwd);
		bean.setRoleCode(role);
		NewUserDao obj=new NewUserDao();
		try {
			obj.addUser(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
