package com.cg.dao;
import java.sql.*;
import com.cg.bean.UserBean;
import com.cg.controller.Conn;

public class NewUserDao {
	Connection c=null;
	PreparedStatement pst=null;
	Conn c1=new Conn();
	public void addUser(UserBean bean) throws Exception
	{
		
		c=c1.getCon();
		String sql="insert into userrole values (?,?,?)";
		pst=c.prepareStatement(sql);
		pst.setString(1,bean.getUserName());
		pst.setString(2,bean.getPassWord());
		pst.setString(3,bean.getRoleCode());
		pst.executeQuery();
		
	}
}
