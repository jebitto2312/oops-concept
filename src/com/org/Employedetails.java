package com.org;

public class Employedetails implements Interface_officer {

	@Override
	public void empolyeName() {
		System.out.println("jkb");
		
	}

	@Override
	public void employeId() {
		System.out.println(7307);
		
	}

	@Override
	public void employeSalary() {
		System.out.println(1000);
		
	}
	public static void main(String[] args) {
		Employedetails e = new Employedetails();
		e.empolyeName();
		e.employeId();
		e.employeSalary();
	}

	

	

	

	

}
