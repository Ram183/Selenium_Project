package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Instagram {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title Name: " + title );
		
		WebElement loginId = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
	
		loginId.sendKeys("Greens@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[2]"));
		
		password.sendKeys("Greens@123");

	}
}

