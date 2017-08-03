package com.luv2code.jsf.hello;




import javax.faces.bean.ManagedBean;

@ManagedBean

public class StudentFive {
	
	private String firstName;
	private String lastName;
	private String language; //since the user can select multiple languages we need an array of strings
	

	
	//create no-arg constructor
	
	public StudentFive() {
		//pre-populate the data in the bean
		firstName = "Mary";
		lastName = "Public";
		language = "Ruby";
		
	}
	
	//define getter/setter methods
	//need to add a getter method for country options

	


	public String getFirstName() { //#{student.firstName} calls this on the student_response.xhtml
		return firstName;
	}

	public void setFirstName(String firstName) { //"#{student.firstName}" calls this on the student_form.xhtml
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	

}