package org.selenium.day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Facebook1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement createNewAccountButton = driver.findElement(By.id("u_0_2"));
		
		createNewAccountButton.click();
		
		WebElement dobMonth = driver.findElement(By.id("month"));
		
		Select s = new Select(dobMonth);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("Print the List of Month in Dob");
		
		for (WebElement x : options) {
			
			String text = x.getText();
			
			System.out.println(text);
		}
		
		driver.quit();
	}

}
