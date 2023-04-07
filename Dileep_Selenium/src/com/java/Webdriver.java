package com.java;

public interface Webdriver {

	public void get(String url);

	public void quit();
}

class Chromedriver implements Webdriver {

	public void get(String url) {
		System.out.println("This is url");
	}

	public void quit() {
		System.out.println("This is quit");
	}

}
