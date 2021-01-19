package org.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Day1_Edge_Flipkart_Url {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		driver.quit();
		
	}

}
