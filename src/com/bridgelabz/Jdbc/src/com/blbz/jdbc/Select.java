package com.blbz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		// 1.load and register a Driver
		Connection con = null;
		Statement st = null;
		ResultSet rs=null;
		String str="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="";
		String sql = "select * from studentTable";
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// 2.Establish a connection between jdbc program and database server
			con = DriverManager.getConnection(str,user,pass );
			// 3.preparing sql statement

			// 4.create the jdbc statement
			st = con.createStatement();
			// 5.submit the sql statement to data base using jdbc statement
			// only DML query(manipulations)
		rs=	st.executeQuery(sql);
			// 6.process the result
		while(rs.next()) {
			String FirstName=rs.getString(1);
			String LastName=rs.getString(2);
			System.out.println(FirstName+"\t"+LastName);
		}	
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 7.close all the connections
			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}
}
