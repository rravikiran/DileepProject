package com.java;

public class InnerClass {

	public static void main(String[] args) {
		One o = new One();

		One.Two t = o.new Two();

		System.out.println(t.addMethod());
	}

}

class One {

	int x = 10;

	class Two {

		public int addMethod() {
			return x;
		}
	}

}
