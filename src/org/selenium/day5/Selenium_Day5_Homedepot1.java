package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Homedepot1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement allDepartments = driver.findElement(By.xpath("//a[text()='All Departments']"));
		
		a.moveToElement(allDepartments).perform();
		
		Thread.sleep(3000);

		WebElement heatingAndCooling = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		
		a.moveToElement(heatingAndCooling).perform();
		
		Thread.sleep(3000);
		
		WebElement airConditioners = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));

		a.moveToElement(airConditioners).perform();
		
		Thread.sleep(3000);
		
		WebElement portableAirConditions = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		
		portableAirConditions.click();
		
	}

}
