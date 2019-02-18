package com.cg.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Quesdispatch {

	RequestDispatcher rd=null;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		rd=req.getRequestDispatcher("/Questions.jsp");
		rd.forward(req, res);
		
	}
}
