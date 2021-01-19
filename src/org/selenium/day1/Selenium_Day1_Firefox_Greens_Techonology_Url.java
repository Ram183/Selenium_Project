package org.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Day1_Firefox_Greens_Techonology_Url {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\Drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("Get Current Url Title: " + "\n" + title);
	
		driver.close();
	
	}

}
