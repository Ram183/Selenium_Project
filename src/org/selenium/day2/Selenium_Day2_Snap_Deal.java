package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Snap_Deal {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("TitleName: " + title);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='userName']"));
		
		login.sendKeys("9999999999");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@id='checkUser']"));
		
		continueButton.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='j_username_new']"));
		
		email.sendKeys("Greens@gmail.com");

		WebElement name = driver.findElement(By.xpath("//input[@id='j_name']"));
		
		name.sendKeys("Greens");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
		
		password.sendKeys("Greens@123");
		
		WebElement cont = driver.findElement(By.xpath("//button[@id='userSignup']"));
		
		cont.click();
	}

}
