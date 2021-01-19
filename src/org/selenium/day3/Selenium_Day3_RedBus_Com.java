package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_RedBus_Com {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		
		WebElement btnArrow = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btnArrow.click();
		
		WebElement signIn = driver.findElement(By.id("signInLink"));
		signIn.click();
		
		Thread.sleep(3000);
		
		WebElement frame1 = driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frame1);
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@type='number']"));
		mobileNumber.sendKeys("9790732601");
		
		String attr = mobileNumber.getAttribute("value");
		System.out.println(attr);
		
	}

}
