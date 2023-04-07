package com.java;

public class SuperVal {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.goldloan();
		ICICI i = new ICICI();
		// i.goldloan();
	}

}

class SBI {

}

class ICICI {

	public void carloan() {
		System.out.println("25%");
	}

	public void homeloan() {
		System.out.println("35%");
	}

	public void goldloan() {
		System.out.println("45%");
	}
}

class HDFC extends ICICI {
	public void goldloan() {

		System.out.println("HDFC gives 25%");
	}

}
