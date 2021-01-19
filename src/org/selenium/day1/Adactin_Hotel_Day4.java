package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Hotel_Day4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("TitleName of Current Url" + "\n" + title);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Ramcrazy18");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ram@123a");	
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement welcomeNotes = driver.findElement(By.id("username_show"));
		System.out.println(welcomeNotes.getAttribute("value"));
		
		WebElement logout = driver.findElement(By.xpath("//a[text()= 'Logout']"));
		logout.click();
		
		driver.quit();
	}

}
