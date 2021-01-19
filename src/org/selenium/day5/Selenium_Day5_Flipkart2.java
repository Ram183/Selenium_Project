package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Flipkart2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
		
		closeButton.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBar.sendKeys("Baby&Kids");
		
		WebElement searchClick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchClick.click();
		
		WebElement babyAndKids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(babyAndKids).perform();
		
		WebElement remoteControlDriver = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		a.doubleClick(remoteControlDriver).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
