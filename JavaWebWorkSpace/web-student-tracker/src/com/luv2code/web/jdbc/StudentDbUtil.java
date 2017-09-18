package com.luv2code.web.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sun.jndi.ldap.Connection;

public class StudentDbUtil {

	private DataSource dataSource;
	
	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Student> getStudents() throws Exception{
		
		List<Student> students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		// get a connection
		
		
		
		return students;
	}
}
