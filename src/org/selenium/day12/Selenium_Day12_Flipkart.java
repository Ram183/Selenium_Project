package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day12_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeButton.click();
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click();
	
		WebElement userName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		
		WebElement loginBttn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Greens@gmail.com')", userName);
		
		js.executeScript("arguments[0].setAttribute('value','Greens@123')", password);
		
		js.executeScript("arguments[0].click()", loginBttn);
		
	}
}