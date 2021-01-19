package org.selenium.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Redbus_Com {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		
		System.out.println("Title : " + title);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
	
		from.sendKeys("Chennai (All Locations)");
		
		WebElement fromClick = driver.findElement(By.xpath("//li[@data-id='123']"));
		
		fromClick.click();
		
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		
		to.sendKeys("Madurai (All Locations)");
		
		WebElement toClick = driver.findElement(By.xpath("//li[@data-id='126']"));
		
		toClick.click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		
		date.click();
		
		WebElement dateClick = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td[2]"));
		
		dateClick.click();
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search_btn']"));
		
		search.click();
		
		WebElement searchResult = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']"));
		
		System.out.println(searchResult.getAttribute("class"));
		
		
		/*WebElement signInClick = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		
		signInClick.click();
		
		WebElement signIn = driver.findElement(By.xpath("//li[@id='signInLink']"));
		
		signIn.click();
		*/
	
	}

}
