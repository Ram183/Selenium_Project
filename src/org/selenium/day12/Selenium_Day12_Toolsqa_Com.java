package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day12_Toolsqa_Com {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement scrollDown = driver.findElement(By.xpath("(//span[@class='text-primary'])[7]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		Thread.sleep(3000);
		
		WebElement scrollUp = driver.findElement(By.xpath("(//span[@class='menu-text'])[1]"));
		
		js.executeScript("arguments[0].scrollIntoView()", scrollUp);
		
	
	}

}
