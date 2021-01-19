package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Swiggy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign up']"));
		
		signIn.click();
	
		WebElement phoneNumber = driver.findElement(By.id("mobile"));
		
		phoneNumber.sendKeys("9876543210");
		
		WebElement name = driver.findElement(By.id("name"));
		
		name.sendKeys("Greens");
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("Greenstechonology1965@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("Greens@123");
		
		WebElement continueBttn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		
		continueBttn.click();
		
		
		
		
	}

}
