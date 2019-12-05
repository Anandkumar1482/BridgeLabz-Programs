package com.blbz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
	public static void main(String[] args) {
		// 1.load and register a Driver
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load and register");
			// 2.Establish a connection between jdbc program and database server
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=");
			System.out.println("Statement created");
			// 3.preparing sql statement
			String sql = "insert into student.studentTable values('anand','kumar')";

			// 4.create the jdbc statement
			st = con.createStatement();
			// 5.submit the sql statement to data base using jdbc statement
			// only DML query(manipulations)
			int x = st.executeUpdate(sql);
			// 6.priocess the result
			if (x == 1) {
				System.out.println("record is inserted");
			} else {
				System.out.println("record is not inserted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 7.close all the connctions
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
