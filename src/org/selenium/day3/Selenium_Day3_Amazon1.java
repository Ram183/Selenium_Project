package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Amazon1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchBttn = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBttn.sendKeys("iphone 12+ Mini");
		
		WebElement sumbit = driver.findElement(By.xpath("(//input[@class='nav-input'])[2]"));		
		sumbit.click();
		
	}

}
