package org.selenium.day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Demoqa {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));

		state.sendKeys("NCR");
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
