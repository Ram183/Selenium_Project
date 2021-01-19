package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Snap_Deal {

	public static void main(String[] args){

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement mobileAndTablets = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
	
	Actions a = new Actions(driver);
	
	a.moveToElement(mobileAndTablets).perform();
	
	WebElement newLaunchesCovers = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		
	a.doubleClick(newLaunchesCovers).perform();
			
	}

}
