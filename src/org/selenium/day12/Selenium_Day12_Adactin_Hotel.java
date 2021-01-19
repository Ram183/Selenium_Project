package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day12_Adactin_Hotel {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginBttn = driver.findElement(By.id("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Ramcrazy18')", userName);
		
		js.executeScript("arguments[0].setAttribute('value','Ram@123a')", password);
		
		js.executeScript("arguments[0].click()", loginBttn);
		
	}

}
