package com.java;

public interface Bank {

	public void loan();

	public void interest();

	public void tenure();

	public default void deposit() {
		System.out.println("per day 25k");
	}

}

interface world {
	public void loan();

	public void interest();

	public void tenure();

}

class bb implements Bank, world {

	public void loan() {

	}

	public void interest() {

	}

	public void tenure() {

	}

}

class UCO implements Bank {

	@Override
	public void loan() {

	}

	@Override
	public void interest() {

	}

	@Override
	public void tenure() {

	}

}

class ABC implements Bank {

	@Override
	public void loan() {

	}

	@Override
	public void interest() {

	}

	@Override
	public void tenure() {

	}

}

class XYZ extends ABC {

	@Override
	public void loan() {

	}

	@Override
	public void interest() {

	}

	@Override
	public void tenure() {
		System.out.println("Value");
	}

}
