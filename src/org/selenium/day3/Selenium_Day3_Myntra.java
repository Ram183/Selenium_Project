package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Myntra {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		mobileNumber.sendKeys("9876543210");
		
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		
	}

}
