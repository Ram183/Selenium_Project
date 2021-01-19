package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumhq.jetty9.util.PathWatcher.DirAction;

public class Selenium_Day5_Homedepot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions a = new Actions(driver);

		WebElement allDepartment = driver.findElement(By.xpath("//a[text()='All Departments']"));

		a.moveToElement(allDepartment).perform();

		Thread.sleep(3000);

		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));

		a.moveToElement(paint).perform();

		Thread.sleep(3000);

		WebElement interiorPaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));

		a.moveToElement(interiorPaint).perform();

		Thread.sleep(3000);

		WebElement ceilingPaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
	
		a.doubleClick(ceilingPaint).perform();
		
	}

}
