package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBar.sendKeys("iphone 12");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchButton.click();
		
		driver.findElement(By.xpath("//div[@class='_2kHMtA'][1]")).click();
	
	}
}
