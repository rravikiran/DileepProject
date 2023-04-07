package com.java;

public class HelloWorld {

	int a = 10, b = 20, c; // in a class we can declare only variables and methods but can not perform
							// actions
	
	int abc;
	


	public void additionMethod() {
		int aa = 10, bb = 20, cc;
		cc = aa + bb;
		c = a + b;
		System.out.println("value of c is " + c);
		
		abc =10;
	}

	public void subMethod() {
		c = a - b;
		System.out.println("Sub value of c is " + c);
	}

	public void mulMethod() {
		c = a * b;
		System.out.println("Mul value of c is " + c);
	}
	
	public String name() {
		return "Ravikiran";
	}
	
	
	public static void main(String[] args) {
		
		HelloWorld hello ;
		
		hello = new HelloWorld();
		
		//or
		
		HelloWorld helloo = new HelloWorld();
		
		helloo.additionMethod();
	}

}
