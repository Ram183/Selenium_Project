package org.selenium.day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Adactin_Hotel2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("Ramcrazy18");

		String userNameattribute = userName.getAttribute("value");

		System.out.println(userNameattribute);

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Ram@123a");

		String passwordattribute = userName.getAttribute("value");

		System.out.println(passwordattribute);

		WebElement login = driver.findElement(By.id("login"));

		login.click();
		
		WebElement welcomeNote = driver.findElement(By.id("username_show"));

		String attribute = welcomeNote.getAttribute("value");

		System.out.println(attribute);
		
		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);
		
		List<WebElement> options = s.getOptions();
		
		System.out.println("List of Location");
		
		for (WebElement x : options) {
			
			String o = x.getAttribute("value");
			System.out.println(o);
		}

		driver.quit();
	}

}
