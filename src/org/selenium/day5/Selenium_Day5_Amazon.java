package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver); 
		
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		
		act.moveToElement(prime).perform();
		
		WebElement fastDelivery = driver.findElement(By.id("multiasins-img-link"));
		
		act.doubleClick(fastDelivery).perform();
		
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}

}
