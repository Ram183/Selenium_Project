package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_Sbi_Bank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
			
		driver.manage().window().maximize();
		
		WebElement continueToLogin = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		
		continueToLogin.click();
		
		WebElement loginButton = driver.findElement(By.id("Button2"));
		loginButton.click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		
		System.out.println(text);
		
		a.accept();
		
	}

}
