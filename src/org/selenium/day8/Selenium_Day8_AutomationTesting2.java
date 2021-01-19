package org.selenium.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day8_AutomationTesting2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
			
		driver.manage().window().maximize();
		
		WebElement textBoxAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textBoxAlert.click();	
		
		WebElement textBoxClickAlert = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		textBoxClickAlert.click();
		
		Alert a = driver.switchTo().alert();

		String text = a.getText();
		
		System.out.println(text);
		
		a.sendKeys("Ram");
		
		a.accept();
	}

}
