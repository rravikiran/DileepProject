package com.java;

public class CallChromeClass {
	
	public static void main(String[] args) {
		
		Webdriver driver;
		
		driver = new Chromedriver();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
