package com.cg.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.ClaimBean;
import com.cg.controller.Conn;
import com.cg.dao.ClaimDao;
public class Ques extends HttpServlet{

	ClaimBean cbean=new ClaimBean();
	PreparedStatement pst=null;
	ResultSet rs=null;
	RequestDispatcher rd=null;
	ClaimDao obj=new ClaimDao();
	Connection c=null;
	Conn c1=new Conn();
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		cbean.setCreason(req.getParameter("claim reason"));
		String ctype=req.getParameter("domain");
		cbean.setAlocation(req.getParameter("accident location"));
		cbean.setAcity(req.getParameter("accident city"));
		cbean.setAstate(req.getParameter("accident state"));
		int zip=Integer.parseInt(req.getParameter("accident zip"));
		cbean.setZip(zip);
		cbean.setCtype(req.getParameter("domain"));
		ClaimDao obj1=new ClaimDao();
		try {
		c=c1.getCon();
		String sql="insert into claim values (claimnum.nextval,?,?,?,?,?,?,policynum.nextval)";
		pst=c.prepareStatement(sql);
		pst.setString(1,cbean.getCreason());
		pst.setString(2,cbean.getAlocation());
		pst.setString(3,cbean.getAcity());
		pst.setString(4,cbean.getAstate());
		pst.setInt(5,zip);
		pst.setString(6,cbean.getCtype());
		pst.executeQuery();
		obj1.doGet(req, res);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
