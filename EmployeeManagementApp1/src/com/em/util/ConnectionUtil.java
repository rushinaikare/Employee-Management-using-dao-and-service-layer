package com.em.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.em.exception.EmployeeException;

public class ConnectionUtil {

	private static Connection connection = null;

	public static Connection getConnection() throws EmployeeException {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagement", "user","password");
			} catch (SQLException e) {
				throw new EmployeeException(e.getMessage());
			} catch (ClassNotFoundException e) {
				throw new EmployeeException(e.getMessage());
			}
		}

		return connection;

	}

}
