package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static void main(String[] args) throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		String appUrl = "https://www.google.com/";
		driver.get(appUrl);

		System.out.println("Get title"+driver.getTitle());
		
		System.out.println("Current url"+driver.getCurrentUrl());
		
		List<WebElement> val = driver.findElements(By.tagName("a"));
		System.out.println("Links present in the page is :"+val.size());
		
		
		//System.out.println("get pagesource"+driver.getPageSource());

	}

}
