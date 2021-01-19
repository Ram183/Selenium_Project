package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Gmail_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement firstName = driver.findElement(By.id("firstName"));
		
		firstName.sendKeys("Greens");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		lastName.sendKeys("Technology");
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("greenstechnology1456878@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[4]"));
		
		password.sendKeys("Greens@123");
	
		WebElement conformPassword = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		conformPassword.sendKeys("Greens@123");
		
		boolean displayed = conformPassword.isDisplayed();
		System.out.println("Value is Displayed :" + displayed);
		
		
		String attribute = conformPassword.getAttribute("value");
		System.out.println(attribute);
	
		WebElement next = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
		next.click();
	
	}

}
