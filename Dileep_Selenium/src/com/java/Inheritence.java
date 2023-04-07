package com.java;

public class Inheritence {

	public static void main(String[] args) {
		Divya d = new Divya();
		d.address();
		d.city();
	}
}

class dileep {
	public void name() {
		System.out.println("Print name");
	}

	public void phonenuber() {
		System.out.println("phone name");
	}

	public void address() {
		System.out.println("address name");
	}
}

class Ravi extends dileep {
	public void pincode() {
		System.out.println("pincode name");
	}

	public void city() {
		System.out.println("city name");
	}
}

class Divya extends Ravi {

}
