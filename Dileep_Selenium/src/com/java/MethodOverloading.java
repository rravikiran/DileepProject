package com.java;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println("First method");
	}

	public void add(int a, int b, int c) {
		System.out.println("second method");
	}

	public void add(String name, int a) {
		System.out.println("third method");
	}

	public void add(int a, String name) {
		System.out.println("fourth method");
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();

		m.add(10, 9, 8);

	}

}
