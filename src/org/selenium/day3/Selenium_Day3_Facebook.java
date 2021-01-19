package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Day3_Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("TitleName: " + title);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("Greenschennai@Gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Greens@123");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='u_0_b']"));
		login.click();
		
	}

}
