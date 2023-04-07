package com.java;

public class ConstructorExample {
	
	private  ConstructorExample() {
		System.out.println("Hi this is constructor");
	}
	
	public  ConstructorExample(int a,String name) {
		System.out.println(name + a);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorExample c = new ConstructorExample();
	}
	
	

}
