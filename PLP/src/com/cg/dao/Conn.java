package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

	
	
	public static Connection getCon() throws Exception //HANDLING THE EXCEPTION
	{	
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection c=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg601","training601");
					return c;
					
	}
}

