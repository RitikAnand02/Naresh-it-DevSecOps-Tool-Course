//SelectTest.java
package com.nt.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectTest {
	//Logger object
	private  static Logger logger=LoggerFactory.getLogger(SelectTest.class);  //static factory  method  giving  Logger class (singleton class) object
	
	//Query  
	private static final String  GET_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";

	public static void main(String[] args) {
		logger.debug("start of main(-) method , application");
		
		try(  //establish the connection
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger"); ){
				logger.info(" Connection with Db s/w is established");
				try(	//create PreparedStatement object
				        PreparedStatement ps=con.prepareStatement(GET_EMPS)){
					logger.debug(" PreparedStatement obj is created");
				try(	// execute  the Query
				ResultSet rs=ps.executeQuery(); ){
					logger.debug(" ResultSet obj is created");
			//the process the ResultSet oobject
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}//while
			logger.warn(" Its  better to process the ResultSet data directly with getXxx() methods , not as String values");
			logger.debug("ResultSEt obj is processed");
		
			
		}//try3
	}//try2
  }//try1
  catch(SQLException se) { //To handle  known exceptions
	  logger.error("DB problem ::"+se.getMessage());
		se.printStackTrace();
	}
		catch(Exception  e) {  // To handle unknows Exceptions
			logger.error("Unknown DB Problem:"+e.getMessage());
			e.printStackTrace();
		}

		logger.debug("end of main(-) method ");
		
	}//main

}//class
