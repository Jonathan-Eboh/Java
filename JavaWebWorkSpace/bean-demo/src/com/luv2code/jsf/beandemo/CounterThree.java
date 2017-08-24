package com.luv2code.jsf.beandemo;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped //the scope only lives per web request, this is the default scope if we dont specify one 
public class CounterThree {
	private int value = 0;
	
	public String increment() {
		value++;
		
		return "counter_three";
	}
	
	public CounterThree() {
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
