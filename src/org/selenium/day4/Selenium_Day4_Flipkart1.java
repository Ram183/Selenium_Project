package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Flipkart1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailId.sendKeys("Greenstechnology@gmail.com");
		String attr = emailId.getAttribute("value");
		System.out.println(attr);
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("Greens@123a");
		String attr1 = password.getAttribute("value");
		System.out.println(attr1);
	}

}
