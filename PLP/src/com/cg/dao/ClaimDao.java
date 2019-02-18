package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.ClaimBean;
import com.cg.controller.Conn;

public class ClaimDao extends HttpServlet 
{
	Connection c=null;
	PreparedStatement pst=null;
	Conn c1=new Conn();
	RequestDispatcher rd=null;
	HttpServletRequest req=null;
	HttpServletResponse res=null;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		rd=req.getRequestDispatcher("/Questions.jsp");
		rd.forward(req, res);
	}


	
}
