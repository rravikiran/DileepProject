package com.java;

public class UseRandom {
	
	public static void main(String[] args) {
		String createId;
		RandomStringGeneration r = new RandomStringGeneration();
		createId = r.randomString();
		System.out.println("Random String is :"+createId);
		
	}

}
