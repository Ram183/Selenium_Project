package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_AutomationTesting {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
		
	driver.manage().window().maximize();
	
	WebElement singleAlert = driver.findElement(By.xpath("//li[@class='active']"));
	singleAlert.click();	
	
	WebElement singleAlertClick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	singleAlertClick.click();
	
	Alert a = driver.switchTo().alert();

	String text = a.getText();
	
	System.out.println(text);
	
	a.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
