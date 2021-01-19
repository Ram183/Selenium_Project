package org.selenium.day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Guru991 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s = new Select(country);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Print the List of Countries");
		
		for (WebElement x : options) {
			
			String attribute = x.getAttribute("value");
			
			System.out.println(attribute);
		}
		
		driver.quit();
	}

}
