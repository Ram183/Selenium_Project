package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Adactin_Hotel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title Name: " + title);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Ramcrazy18");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Ram@123a");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		
		WebElement welcomeNotes = driver.findElement(By.xpath("//input[@id='username_show']"));
		System.out.println(welcomeNotes.getAttribute("value"));

		
	}

}
