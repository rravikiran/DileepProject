package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/menu/");

		// Maximizing window
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		  act.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 2']")))
		  .moveToElement(driver.findElement(By.xpath("SUB SUB LIST »"))).perform();
		  driver.findElement(By.xpath("Sub Sub Item 1")).click();
		 
		


	}

}
