package com.luv2code.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Define datasource/connection pool for Resource Injection
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Step 1: Set up the printwriter (sends response back to the browser)
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		//Step 2: Get a connection to the database
		Connection myConn = null;
		java.sql.Statement myStmt = null; //had to change this per https://stackoverflow.com/questions/36627914/type-mismatch-cannot-convert-from-java-sql-preparedstatement-to-jdbcdemo-prepar
		ResultSet myRs = null;
		
		try {
		myConn = dataSource.getConnection(); //"dataSource" is the same thing as connection pool, so the connection comes from the connection data pool here
		
		//Step 3: Create a SQL query
		String sql = "select * from student"; //made a string calling it "sql" it represents our raw sql command
		myStmt = myConn.createStatement();
		//Step 4: Execute SQL query
		myRs = myStmt.executeQuery(sql);
		
		//Step 5: Process the result set
			while (myRs.next()) {
				String email = myRs.getString("email"); //getting the email from that given column name
				out.println(email); //send output to browser instead of standard output
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
