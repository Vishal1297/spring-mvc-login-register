package org.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	
	private static Connection CONN;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		CONN = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "root");
		return CONN;
	}

	public static void closeConnection(Connection CONN) throws SQLException {
		CONN.close();
	}

}