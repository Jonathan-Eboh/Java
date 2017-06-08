package adt;

public class Counter2 {

	 String name = null;
	 int value = 0;
	
	public Counter2(String str){
		this.name = str;
	}
	
	public void increment(){
		value++;
	}
	
	public int getCurrentValue(){
		return value;
	}
	
	public String toString(){
		return name + ": " + value;
	}
}
