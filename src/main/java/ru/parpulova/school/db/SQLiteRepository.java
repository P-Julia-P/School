package ru.parpulova.school.db;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ru.parpulova.school.subjects.Subject;

public class SQLiteRepository implements Repository, Closeable{
	
	private static final String DRIVER_NAME = "org.sqlite.JDBC";
	private static final String CONNECTION_STRING = "jdbc:sqlite:school.db";
	
	private static final String SQL_SELECT = "SELECT id, title, duration, course FROM subject";
	
	
	private Connection conn;
	
	
	public SQLiteRepository() {
		
		try {
			
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(CONNECTION_STRING);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Subject> getSubjects() {
		try {
			
			Statement cmd = conn.createStatement();
			ResultSet result = cmd.executeQuery(SQL_SELECT);
			//result.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void close() throws IOException {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				throw new IOException(e);
			}
		
	}

}
