package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Snap_Deal1 {

	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement womensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		
	Actions a = new Actions(driver);
	
	a.moveToElement(womensFashion).perform();
	
	WebElement footware = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
	
	a.doubleClick(footware).perform();
		
	Thread.sleep(3000);	
		
	WebElement heels = driver.findElement(By.xpath("//div[text()='Heels']"));
	
	a.doubleClick(heels).perform();
	
	String url = driver.getCurrentUrl();
	System.out.println("Current Url of Page: " + url);
	
	}
}
