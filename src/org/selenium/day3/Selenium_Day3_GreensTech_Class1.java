package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_GreensTech_Class1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement modelResume = driver.findElement(By.id("heading201"));
		
		modelResume.click();
		
		WebElement resumeModel = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		
		resumeModel.click();
		
	}
}
