package com.java;

public class OverridingExample {

	public static void main(String[] args) {
		child d = new child();
		d.addition();

		SBII s = new SBII();
		ICICII i = new ICICII();
		RBIBank a = new RBIBank();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("RBIBank Rate of Interest: " + a.getRateOfInterest());
	}

}

class parent {
	public void addition() {
		System.out.println("This is parent");
	}
}

class child extends parent {
	public void addition() {
		System.out.println("This is child class");

	}

}

class RBIBank {
	public int getRateOfInterest() {
		return 2;
	}
}

class SBII extends RBIBank {
	public int getRateOfInterest() {
		return 8;
	}
}

class ICICII extends RBIBank {
	public int getRateOfInterest() {
		return 10;
	}
}
