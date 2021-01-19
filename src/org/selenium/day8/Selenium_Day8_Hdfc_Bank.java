package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_Hdfc_Bank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
			
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
		
		WebElement continueButton = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		continueButton.click();
		
		Alert a = driver.switchTo().alert();
	
		String text = a.getText();
		
		System.out.println(text);
	
		a.accept();
		
	}

}
