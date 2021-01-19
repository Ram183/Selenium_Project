package org.selenium.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Facebook_Com {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();
		
		System.out.println("TitleName: " + title);

		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']"));
		
		emailAddress.sendKeys("Greens@gmail.com");
		
		System.out.println(emailAddress.getAttribute("value"));

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		password.sendKeys("Greens@123");
		
		System.out.println(password.getAttribute("value"));

		WebElement login = driver.findElement(By.xpath("//button[@id='u_0_b']"));
		
		login.click();

		WebElement text = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		
		System.out.println(text.getText());

		driver.close();

	}

}
