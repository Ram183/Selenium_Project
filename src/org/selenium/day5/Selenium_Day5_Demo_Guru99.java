package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Demo_Guru99 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement bankOption = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement debitSideAccount = driver.findElement(By.id("bank"));
		
		WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement debitSideAmount = driver.findElement(By.id("amt7"));
		
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement creditSideAccount = driver.findElement(By.id("loan"));
		
		WebElement amount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement creditSideAmount = driver.findElement(By.id("amt8"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(3000);

		a.dragAndDrop(bankOption, debitSideAccount).perform();
		
		Thread.sleep(3000);
		
		a.dragAndDrop(sales, creditSideAccount).perform();
		
		Thread.sleep(3000);
		
		a.dragAndDrop(amount, debitSideAmount).perform();
		
		Thread.sleep(3000);
		
		a.dragAndDrop(amount1, creditSideAmount).perform();
		
	}

}
