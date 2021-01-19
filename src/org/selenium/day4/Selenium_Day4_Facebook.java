package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("9876543210");
		String user1 = userName.getAttribute("value");
		System.out.println(user1);
		
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Greens@123a");
		String user2 = password.getAttribute("value");
		System.out.println(user2);
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
	}

}
