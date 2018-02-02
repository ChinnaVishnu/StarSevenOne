package com.jocata.star.Mis.Latest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDBTest4 {

	   private static Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;

	  
	    public  static void setUp() {
	            String databaseURL = "jdbc:oracle:thin:@192.168.0.71:1521:orcl";
	            String user = "read_only";
	            String password = "A2k_s$6ljf";
	            connection = null;
	            try {
	                Class.forName("oracle.jdbc.driver.OracleDriver");
	               // System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    //System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }

	    
	    public static  String  getEmployeesFromDataBase() {
	    	setUp();
	    	
	    	String EmpName = null;
	    	
	        try {
	            String query = "select count(1) from JOCATA_STAR.TBL_BENCHMARK";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	            
	            while(rs.next()){
	                 EmpName= rs.getString("COUNT(1)");
	               // System.out.println(EmpName);
	                
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
			return EmpName;
			
	    }

	   
	    public  static void tearDown() {
	      if (connection != null) {
	                try {
	                    System.out.println("Closing Database Connection...");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	      }	
	
	    
	  public static void main(String[] args) {
		
	String rr=	  SeleniumDBTest4.getEmployeesFromDataBase(); 
	System.out.println(rr);	  
	
	}  
	    
}
