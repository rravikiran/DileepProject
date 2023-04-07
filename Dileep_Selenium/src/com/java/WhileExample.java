package com.java;

public class WhileExample {

	public boolean loop(int a, int b) {

		boolean flag = false;

		while (a > b) {
			System.out.println("A value is greater than b");
			flag = true;
			break;
		}

		return flag;

	}

	public static void main(String[] args) {

		WhileExample w = new WhileExample();
		boolean value = w.loop(100, 20);
		System.out.println(value);
	}

}
