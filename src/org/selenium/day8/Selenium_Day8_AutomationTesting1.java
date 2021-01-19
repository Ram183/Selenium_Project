package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_AutomationTesting1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
			
		driver.manage().window().maximize();
		
		WebElement doubleOptionAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		doubleOptionAlert.click();	
		
		WebElement doubleOptionClickAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		doubleOptionClickAlert.click();
		
		Alert a = driver.switchTo().alert();

		String text = a.getText();
		
		System.out.println(text);
		
		a.accept();
	}

}
