package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_Flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closeIntroBox = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		closeIntroBox.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		
		searchBar.sendKeys("redmi phone");
		
		WebElement searchButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		searchButton.click();
		
		WebElement firstProduct = driver.findElement(By.xpath("//div[text()='Redmi 9i (Nature Green, 64 GB)']"));
		
		firstProduct.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String x : allWindow) {
			
			if (!parentWindow.equals(allWindow)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement priceOfProduct = driver.findElement(By.xpath("(//div[text()='₹8,299'])[1]"));
		
		String text = priceOfProduct.getText();
		
		System.out.println(text);
		
		driver.quit();
	}

}
