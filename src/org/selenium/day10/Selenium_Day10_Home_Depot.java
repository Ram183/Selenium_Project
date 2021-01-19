package org.selenium.day10;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.PathWatcher.DirAction;

public class Selenium_Day10_Home_Depot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBar = driver.findElement(By.id("headerSearch"));
		
		searchBar.sendKeys("Ceiling Fan");
		
		WebElement searchButton = driver.findElement(By.id("headerSearchButton"));
		
		searchButton.click();
	
		WebElement firstStProduct = driver.findElement(By.xpath("(//span[text()='Kensgrove 72 in. LED Indoor/Outdoor Espresso Bronze Ceiling Fan with Remote Control'])[1]"));
		
		firstStProduct.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String x : allWindows) {
			
			if (!parentWindow.equals(allWindows)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement withRemote = driver.findElement(By.xpath("//button[text()='With Remote']"));
		
		withRemote.click();

		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
