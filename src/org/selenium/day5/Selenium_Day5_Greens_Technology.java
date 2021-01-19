package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Greens_Technology {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement courses = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		a.moveToElement(courses).perform();
		
		WebElement softwareTesting = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		
		a.moveToElement(softwareTesting).perform();
		
		WebElement seleniumTraining = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		
		a.doubleClick(seleniumTraining).perform();
	
	}

}
