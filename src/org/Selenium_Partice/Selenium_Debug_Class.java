package org.Selenium_Partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Debug_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url: " + currentUrl);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Vishal GymBoy");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Nitish@123");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		String url = driver.getCurrentUrl();
		System.out.println("New Page Url:" + url);
		
	}

}
