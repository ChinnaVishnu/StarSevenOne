package com.jocata.star.scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.concurrent.TimeUnit;

public class SeleniumDataBaseTesting2 {
	private WebDriver driver;
	  private Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;

	   
	    public void setUp() {
	            String databaseURL = "jdbc:mysql://localhost:3306/testram";
	            String user = "root";
	            String password = "root";
	            connection = null;
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }

	    
	    public void getEmployeesFromDataBase() {
	        try {
	            String query = "SELECT COUNT( * ) AS  `fristname` FROM `mahesd`";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);

	            
	            
	            
	            
	            while(rs.next()){
	                //int EmpId= rs.getInt("empid");
	                String EmpName= rs.getString("fristname");
	               // String EmpAddress=rs.getString(3);
	               // String EmpDept=rs.getString("lastname");
	               // Double EmpSal= rs.getDouble(5);
	                //System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
	              //  System.out.println(EmpId+"\t"+EmpName+"\t"+EmpDept);
	                
	            
	                System.out.println(EmpName);//3
	                
	                
	                
	                
	                
	                
	                
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }

	   
	    public void tearDown() {
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
			
	    	
	    	SeleniumDataBaseTesting2 se=new SeleniumDataBaseTesting2();
	    	
	    	se.setUp();
	    	se.getEmployeesFromDataBase();
	    	se.tearDown();
	    	
		}
	    
	    
	
}
