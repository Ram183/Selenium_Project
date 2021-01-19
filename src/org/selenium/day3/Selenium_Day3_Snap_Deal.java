package org.selenium.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Snap_Deal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		signIn.click();
		
		WebElement newUserRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		newUserRegister.click();
		
		Thread.sleep(3000);
		
		WebElement mobileNumber = driver.findElement(By.xpath("//div[@class='number-prefix number-prefix-disable']"));
		
		JavascriptExecutor sr =(JavascriptExecutor)driver;
		
		sr.executeScript("arguments[0].setAttribute('value','9876543210')", mobileNumber);
		
		WebElement continueButton = driver.findElement(By.xpath("(//button[text()='continue'])[1]"));
		
		sr.executeScript("arguments[0].click()", continueButton);

		
		
		
		
		
		
	}

}
