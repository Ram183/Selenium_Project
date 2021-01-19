package org.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day6_Amazon {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement helloSignIn = driver.findElement(By.id("nav-link-accountList"));
		helloSignIn.click();

		WebElement emailOrPhoneNumber = driver.findElement(By.id("ap_email"));
		emailOrPhoneNumber.sendKeys("Greens@Gmail.com");

		Actions act = new Actions(driver);

		act.doubleClick(emailOrPhoneNumber).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}

}
