package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class BaseDAO {
	Connection connection= null;
	public Connection getConnection(){
		
		try{
			//step1:load drivers
			Class.forName("org.gjt.mm.mysql.Driver"); //driver for mySql server
			
			// Class.forName("oracle.jdbc.driver.OracleDriver");//JDBC driver class for oracle server
			///step 2: Establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	}catch(Exception e){
		e.printStackTrace();
	}
return connection;
}
}