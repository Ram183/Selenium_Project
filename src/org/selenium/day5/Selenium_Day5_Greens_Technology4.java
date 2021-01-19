package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Greens_Technology4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement courses = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		a.moveToElement(courses).perform();
		
		WebElement dataWareHouse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		
		a.moveToElement(dataWareHouse).perform();
		
	}

}
