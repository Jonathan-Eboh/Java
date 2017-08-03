package com.luv2code.jsf.hello;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class StudentThree {
	
	private String firstName;
	private String lastName;
	private String language;
	
	// list of countries for the drop-down list
	List<String> countryOptions;
	
	//create no-arg constructor
	
	public StudentThree() {
	
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
