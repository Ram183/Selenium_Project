package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Shop_Clue1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement sportAndMore = driver.findElement(By.id("nav_45"));
		
		Actions a = new Actions(driver);
		a.moveToElement(sportAndMore).perform();
		
		WebElement weightGain = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		
		a.click(weightGain).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
