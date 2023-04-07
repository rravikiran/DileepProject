package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {
	public static void main(String[] args) throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		String appUrl = "https://www.google.com/";
		driver.get(appUrl);

		Thread.sleep(3000);

		// Click on Registration link
		driver.findElement(By.xpath("//a[text()='Gmail']"));
		Thread.sleep(3000);
		// Go back to Home Page
		driver.navigate().back();
		Thread.sleep(3000);

		// Go forward to Registration page
		driver.navigate().forward();
		Thread.sleep(3000);

		// Refresh browser
		driver.navigate().refresh();

	}

}
