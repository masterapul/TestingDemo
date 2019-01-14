package com.testing.reverse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Susanta");
		if(con==null) {
			System.out.println("connection not established.........");
		}else{
			System.out.println("connection established.........");
		}
	}
	}

