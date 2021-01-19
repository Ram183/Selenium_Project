package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Snap_Deal {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBar = driver.findElement(By.id("inputValEnter"));
		searchBar.sendKeys("Sleek Smart Watch");
		
		WebElement searchButton = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		searchButton.click();
		
		WebElement selectFirstProduct = driver.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded'])[1]"));
		selectFirstProduct.click();	
	}

}
