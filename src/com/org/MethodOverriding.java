package com.org;
//child class

public class MethodOverriding extends Methodoverloading {

	@Override
	public void employeName(String name) {
		super.employeName(name);
	}
	
	 @Override
	public void employeId(int id) {
		super.employeId(id);
	}
	//main method
	 public static void main(String[] args) {
    //object creation
		 MethodOverriding v = new MethodOverriding();
		 //method calling
		 v.employeName("jkb");
		 v.employeId(7307);
	 }
}

	


	
	





	
		

	

