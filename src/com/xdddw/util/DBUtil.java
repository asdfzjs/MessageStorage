package com.xdddw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {

	public static Connection getConnection() throws Exception {
		Connection connection = null;
		String className = "com.mysql.jdbc.Driver";
		Class.forName(className);
		String user = "GtYLSlBK";
		String password = "Hcp82LiXC";
		String url = "jdbc:mysql://139.196.109.110:3306/app?useUnicode=true&characterEncoding=UTF-8";
		connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

	public void closeAllDBResources(Connection connection,
			PreparedStatement preparedStatement, ResultSet resultSet)
			throws Exception {
		if (resultSet != null) {
			resultSet.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println(getConnection());
	}
}
