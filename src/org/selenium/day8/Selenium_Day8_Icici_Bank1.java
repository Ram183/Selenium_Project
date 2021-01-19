package org.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_Icici_Bank1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
			
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("DUMMY1")).click();

		WebElement userName = driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
		userName.sendKeys("2978453");
		
		WebElement password = driver.findElement(By.xpath("//input[@class='login-input-password']"));
		password.sendKeys("Greens@123");
		
		WebElement login = driver.findElement(By.xpath("//input[@class='cta']"));
		login.click();
		
	}

}
