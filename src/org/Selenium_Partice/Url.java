package org.Selenium_Partice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Current Url : " + driver.getCurrentUrl());
		
		WebElement userTxt = driver.findElement(By.id("email"));
		userTxt.sendKeys("I dont have facebook id");
		
		WebElement passTxt = driver.findElement(By.id("pass"));
		passTxt.sendKeys("here also i dont have pass");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		Thread.sleep(3000);
		
		System.out.println("Last Current Url : " + driver.getCurrentUrl());
		
	}

}
