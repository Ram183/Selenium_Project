package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Icici {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title Name: " + title);
		
		WebElement userName = driver.findElement(By.id("//input[@class='login-input mode-select-userid']"));
		userName.click();
		
	}

}
