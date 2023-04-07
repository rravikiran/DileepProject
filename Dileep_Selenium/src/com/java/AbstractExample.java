package com.java;

public class AbstractExample {
	
	public static void main(String[] args) {
		
		ATM m ;
		m = new ICI();
		m.balanceEnq();
		m = new HDFCC();
		m.balanceEnq();
	}

}

abstract class ATM {

	abstract void cashWithdraw();

	public abstract void balanceEnq();
	
	public void pinChange() {
		System.out.println("Pinchange");
	}

}

class ICI extends ATM {

	void cashWithdraw() {
		System.out.println("Car loan");

	}

	public void balanceEnq() {
		System.out.println("ICICI balance");
	}

}

class HDFCC extends ATM {

	void cashWithdraw() {
		System.out.println("Car loan");

	}

	public void balanceEnq() {
		System.out.println("HDFC Balance");
	}

}
