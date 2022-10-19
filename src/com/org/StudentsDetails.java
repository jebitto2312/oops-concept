package com.org;
//class

public class StudentsDetails {
	//method
	public StudentsDetails() {
	System.out.println("student");
	}
	public StudentsDetails(String name) {
		System.out.println(name);
	}
	public StudentsDetails(int age) {
		System.out.println(age);
	}
	public StudentsDetails(float salary) {
		System.out.println(salary);
	}
	//main method
	public static void main(String[] args) {
	//object creation
		StudentsDetails s = new StudentsDetails();
		StudentsDetails s1 = new StudentsDetails("jkb");
		StudentsDetails s2 = new StudentsDetails(28);
		StudentsDetails s3 = new StudentsDetails(50000);
		
		
	}
		
	

}
