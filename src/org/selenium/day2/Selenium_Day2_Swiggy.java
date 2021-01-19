package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Swiggy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title Name: " + title);
		
		WebElement location = driver.findElement(By.xpath("//input[@id='location']"));
		
		location.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		WebElement locationClick = driver.findElement(By.xpath("(//span[@class='_2W-T9'])[1]"));
		
		locationClick.click();
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("New Page Url: " + url);
	
		driver.quit();
	
	}

}
