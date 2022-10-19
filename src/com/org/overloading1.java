package com.org;

public class overloading1 {
	//method

	public void customerDetails(int a) {//datatype
		System.out.println(a);
	}
	public void customerDetails(String item1,String item2,String item3) {
		System.out.println((item1+" "+item2+" "+item3));
	}
	public void customerDetails(int b,int c,int d) {//datatype
		System.out.println(b+" "+c+" "+d);
	}
	public static void main(String[] args) {
		//object
		overloading1 j = new overloading1();
		//method calling
		j.customerDetails(1);
		j.customerDetails("laptop","phone","tab");
		j.customerDetails(35000,25000,9999);
	

	}

}
