package org.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greens_Technology_Day4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement address = driver.findElement(By.xpath("//div[@class='trainer-info'][2]"));
		System.out.println(address.getText());
		
		
		
		
	}

}
