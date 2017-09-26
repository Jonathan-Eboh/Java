<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
	
</head>

<body> 


	<div id="wrapper">
		<div id="header">
			<h2>Top-bright University: Update a student </h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Update Student</h3>
	
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />
			
			<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="firstName" 
								   value="${THE_STUDENT.firstName}" /></td>
					</tr>
					
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lastName" 
								   value="${THE_STUDENT.lastName}" /></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="email" 
								   value="${THE_STUDENT.email}" /></td>
					</tr>
					
					<tr>
						<td><label>Enroll Student!:</label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
			
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="StudentControllerServlet">Return to student directory</a>
		</p> 
		
		<!-- added another button because I think it looks better than a floating link -->
		
		<!-- <input type="button" value="Back" 
					onclick="window.location.href='list-students.jsp'; return false;"
					class="add-student-button"
			/> -->
		
	</div>
</body>

</html>