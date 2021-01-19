package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day12_Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		WebElement loginId = driver.findElement(By.id("u_0_b"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Greens@gmail.com')", emailId);
		
		js.executeScript("arguments[0].setAttribute('value','Greens@123')", password);
		
		js.executeScript("arguments[0].click()", loginId);
		
	}

}
