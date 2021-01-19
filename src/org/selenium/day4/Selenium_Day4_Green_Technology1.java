package org.selenium.day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Green_Technology1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement trainer = driver.findElement(By.id("home-tab"));
		
		trainer.click();
		
		WebElement textPara = driver.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
		System.out.println(textPara);
		
		}
		
	}


