package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_Greens_Technology {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement seleniumTestPaper = driver.findElement(By.id("heading303"));
		
		seleniumTestPaper.click();
		
		WebElement DayTenTask = driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
		
		DayTenTask.click();
		
		String parentWind = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String x : allWindows) {
			
			if (!parentWind.equals(allWindows)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement printTheValue = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		
		String text = printTheValue.getText();
		
		System.out.println(text);
		
		
		driver.quit();
		
	}

}
