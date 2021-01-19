package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Amazon1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signINButton = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(signINButton).perform();
		
		WebElement startHereButton = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		
		a.doubleClick(startHereButton).perform();
		
		Thread.sleep(3000);
		
		WebElement customerName = driver.findElement(By.id("ap_customer_name"));
		customerName.sendKeys("Greens");
		
		WebElement phoneNumber = driver.findElement(By.id("ap_phone_number"));
		phoneNumber.sendKeys("9999999999");
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("Greenstechnology@gmail.com");
		
		WebElement setPassword = driver.findElement(By.id("ap_password"));
		setPassword.sendKeys("Greens@123456@a");
		
		/*WebElement showPassword = driver.findElement(By.id("auth-show-password-checkbox-container"));
		showPassword.click();*/
		
		WebElement verifyMobileNumber = driver.findElement(By.id("continue"));
		verifyMobileNumber.click();
		
	}

}
