package com.corejavaprojects.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	public static Connection getConnection() throws IOException, SQLException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\eMexo\\MyWorkspaces\\Workspace_1\\CoreJavaProject\\src\\com\\corejavaprojects\\jdbc\\jdbcdb.properties");
		props.load(fis);

		Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"),
				props.getProperty("DB_PASSWORD"));
		return conn;
	}
}