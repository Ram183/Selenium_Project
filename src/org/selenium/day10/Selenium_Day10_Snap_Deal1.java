package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_Snap_Deal1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBar = driver.findElement(By.id("inputValEnter"));
		
		searchBar.sendKeys("hand sanitizer");
		
		WebElement seachButton = driver.findElement(By.xpath("//span[text()='Search']"));
		
		seachButton.click();
		
		WebElement product = driver.findElement(By.xpath("//p[text()='Sterlomax 80% Ethanol Based Sanitizers 500 mL Pack of 1']"));
		
		product.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String x : allWindow) {
			
			if (!parentWindow.equals(allWindow)) {
				
				driver.switchTo().window(x);
				
			}
		}
		
		WebElement addToCart = driver.findElement(By.xpath("(//span[text()='ADD TO CART'])[1]"));
		
		addToCart.click();
		
		driver.quit();
		
	}

}
