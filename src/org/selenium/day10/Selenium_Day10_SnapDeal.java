package org.selenium.day10;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day10_SnapDeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBar = driver.findElement(By.id("inputValEnter"));
		
		searchBar.sendKeys("iphone 7");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		searchButton.click();
		
		WebElement selectFirstProduct = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Plus Soft Silicon Cases Wow Imagine - Black']"));
		
		selectFirstProduct.click();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows);
		
		for (String x : allWindows) {
			
			if (!parentWindow.equals(allWindows)) {
				
				driver.switchTo().window(x);
			}
		}
		
		Thread.sleep(5000);
		
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		
		addToCart.click();
		
		WebElement yourPayAmount = driver.findElement(By.xpath("//div[@class='you-pay']"));
		
		String text = yourPayAmount.getText();
		
		System.out.println(text);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
