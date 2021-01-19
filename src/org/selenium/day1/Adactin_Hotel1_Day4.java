package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Adactin_Hotel1_Day4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Ramcrazy18");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ram1123");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement invalid = driver.findElement(By.xpath("//b[contains(text(),'details')]"));
		System.out.println(invalid.getText());
		
		System.out.println(password.getAttribute("name"));
		
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
