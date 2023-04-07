package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikiran Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Dileep");

		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Dileep");

		driver.findElement(By.id("userEmail")).sendKeys("Dileep@gmail.com");

		//driver.findElement(By.xpath("//input[@name='gender'][1]")).click();

		driver.findElement(By.id("userNumber")).sendKeys("9988776655");

		boolean selected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).isSelected();
		
		boolean selectedd = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).isDisplayed();
		
		boolean selecteddd = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).isEnabled();
		
		System.out.println(selected);
		System.out.println(selectedd);
		System.out.println(selecteddd);

		if (!selected) {

			driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		} else {
			System.out.println("Already selected");
		}

	}

}
