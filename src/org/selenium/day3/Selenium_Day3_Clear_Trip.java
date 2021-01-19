package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Clear_Trip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement fromTo = driver.findElement(By.xpath("//input[@id='from_station']"));
		
		fromTo.sendKeys("Chennai Central (MAS)");
		
		WebElement to = driver.findElement(By.id("to_station"));
		
		to.sendKeys("Salem Junction (SA)");
		
		WebElement searchBttn = driver.findElement(By.id("trainFormButton"));
		
		searchBttn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
