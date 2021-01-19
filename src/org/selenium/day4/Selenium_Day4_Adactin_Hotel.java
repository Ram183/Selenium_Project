package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Adactin_Hotel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Ramcrazy18");
		String user = userName.getAttribute("value");
		System.out.println(user);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ram@123a");
		String pass = password.getAttribute("value");
		System.out.println(pass);
	}
}
