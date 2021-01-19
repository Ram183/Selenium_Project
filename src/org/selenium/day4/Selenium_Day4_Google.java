package org.selenium.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbar.sendKeys("Greens Velmurugan");
		
		WebElement searchClick = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		searchClick.click();
		
		WebElement firstOptionClick = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));
		firstOptionClick.click();
	}

}
