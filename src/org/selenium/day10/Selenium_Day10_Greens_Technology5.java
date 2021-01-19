package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_Greens_Technology5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement seleniumTestpaper = driver.findElement(By.id("heading304"));
		
		seleniumTestpaper.click();
		
		WebElement dayTen = driver.findElement(By.xpath("//a[text()=' TESTNG']"));
		
		dayTen.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String x : allWindow) {
			
			if (!parentWindow.equals(allWindow)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement printText = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		
		String text = printText.getText();
		
		System.out.println(text);
		
		driver.quit();
	}

}
