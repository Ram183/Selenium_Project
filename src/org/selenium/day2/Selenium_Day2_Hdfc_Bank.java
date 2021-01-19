package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Hdfc_Bank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title Name: " + title);
		
		WebElement customerId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		customerId.sendKeys("28947863");
		
		WebElement continueKey = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		continueKey.click();
		
	}

}
