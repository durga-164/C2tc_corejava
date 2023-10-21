package com.java.jdbcprograms;
import java.sql.*;
import javax.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/C21","root","teena@2003");
		    //creating a statement
			Statement stmt=conn.createStatement();
		    
			//execute a sql insert statement via executeupdate()
			/*String sqlInsert="insert into book values(30,'c++',630,3)";
			System.out.println("the sql statement is "+sqlInsert);
       
			int countinsert=stmt.executeUpdate(sqlInsert);
			System.out.println("showing the number of records inserted :"+countinsert);
			*/
			
			//delete the record from the database
			String sqldelete="delete from book where bookId=30";
			System.out.println("the sql statement is "+sqldelete);
       
			int countdelete=stmt.executeUpdate(sqldelete);
			System.out.println("showing the number of records deleted :"+countdelete);
			
			
			
			//execute the query
			String strSelect="select bookTitle,bookPrice,quantity from book";
			System.out.println("the sql statement is "+strSelect);
			
			//process the result
			ResultSet rst=stmt.executeQuery(strSelect);
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
