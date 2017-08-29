package com.luv2code.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Student {

	
	private String firstName;
	private String lastName;
	
	//create no-arg constructor
	
	public Student() {
		
	}
	
	//define getter/setter methods

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
		
}


