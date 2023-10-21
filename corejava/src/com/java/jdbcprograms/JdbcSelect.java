package com.java.jdbcprograms;
import java.sql.*;

import javax.sql.*;//step 1 is importing the packages

public class JdbcSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //step 2 is load and register the drivers(skipping it bcoz not mandatory for latest versions)
		//step 3 is directly establishing the connection
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/C21","root","teena@2003");
		//step 4 create a statement
		Statement st =conn.createStatement();
		//execute the query
		String strSelect="select bookTitle,bookPrice,quantity from book";
		System.out.println("the sql statement is"+strSelect);
		
		//process the result
		ResultSet rst=st.executeQuery(strSelect);
		System.out.println("the records are");
		int rowcount=0;
		while(rst.next()) {
			String bookTitle=rst.getString("bookTitle");
			int bookPrice=rst.getInt("bookPrice");
			int quantity=rst.getInt("quantity");
			System.out.println(bookTitle+" "+bookPrice+" "+quantity);
			++rowcount;
			
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
