package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_Canara_Bank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
			
		driver.manage().window().maximize();
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		
		signInButton.click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		
		System.out.println(text);
		
		a.accept();
		
	}

}
