package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_Flipkart2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closeIntroBox = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		closeIntroBox.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		
		searchBar.sendKeys("hp laptop");
		
		WebElement searchButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		searchButton.click();
		
		WebElement firstProduct = driver.findElement(By.xpath("//a[text()='HP 14s Core i3 10th Gen - (8 GB/256 GB SSD/Windows 10 H...']"));
		
		firstProduct.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String x : allWindow) {
			
			if (!parentWindow.equals(allWindow)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement priceOfProduct = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		
		System.out.println(priceOfProduct.getText());
		
		driver.quit();
	}

}
