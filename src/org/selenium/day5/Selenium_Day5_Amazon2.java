package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Amazon2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signINButton = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(signINButton).perform();
		
		WebElement primeMembership = driver.findElement(By.xpath("//span[text()='Your Prime Membership']"));
		
		a.doubleClick(primeMembership).perform();
		
		
		
		
		
		
		
		
		
	}

}
