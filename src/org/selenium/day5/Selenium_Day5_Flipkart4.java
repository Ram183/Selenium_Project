package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Flipkart4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
		
		closeButton.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBar.sendKeys("TVS & Appliances");
		
		WebElement searchClick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchClick.click();
		
		WebElement tvsAndAppliances = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(tvsAndAppliances).perform();
		
		WebElement mi = driver.findElement(By.xpath("//a[text()='Mi']"));
		
		a.doubleClick(mi).perform();
		
		WebElement mi4APro = driver.findElement(By.xpath("//div[text()='Mi 4A PRO 80 cm (32) HD Ready LED Smart Android TV With Google Data Saver']"));
		mi4APro.click();

	}

}
