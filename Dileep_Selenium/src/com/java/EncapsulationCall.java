package com.java;

public class EncapsulationCall {

	public static void main(String[] args) {

		EncapsulationExample e = new EncapsulationExample();
		e.dileep("Dileep");
		e.setAge(12);
		e.setValue(12.3f);
		
		System.out.println(e.getAge() + e.getName());

	}

}
