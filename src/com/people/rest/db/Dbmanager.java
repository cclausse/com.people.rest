package com.people.rest.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbmanager {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://ccclouddb.ca2yseolepdv.eu-west-1.rds.amazonaws.com:3306", "administrator", "sysadmin");
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
