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
		
		java.sql.Connection myConn = null;
		java.sql.Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// get a connection
			myConn = dataSource.getConnection();
			// create sql statement
			String sql = "select * from student order by last_name";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while(myRs.next()) { //looping through the result set
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				// add it to the list of students
				students.add(tempStudent);
			}
			
			return students;
		
		}
		finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
			
		}
		
	}

	private void close(java.sql.Connection myConn, Statement myStmt, ResultSet myRs) {
		
		try {
			if(myRs != null) {
				myRs.close();
			}
			
			if(myStmt != null) {
				myStmt.close();
			}
			
			if(myConn != null) {
				myConn.close(); //this doesnt really close the connection it just puts it back into the data pool
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
