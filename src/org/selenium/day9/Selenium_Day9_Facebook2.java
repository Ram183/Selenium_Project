package org.selenium.day9;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Facebook2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement createNewAccountButton = driver.findElement(By.id("u_0_2"));
		
		createNewAccountButton.click();
		
		WebElement dobDay = driver.findElement(By.id("day"));
		
		Select s = new Select(dobDay);
	
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
		
			if (i %2 == 0) {
			
				System.out.println(i);	
			}
		}
		
		driver.quit();
			
	}

}
