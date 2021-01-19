package org.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_Hdfc_Bank1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
			
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frame);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		userName.sendKeys("78634313");
		
		WebElement continueButton = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		
		continueButton.click();
		
		WebElement passwordText = driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
		passwordText.sendKeys("Greens@123");
		
		WebElement loginClick = driver.findElement(By.xpath("//img[@alt='Login']"));
		
		loginClick.click();
		
	}

}
