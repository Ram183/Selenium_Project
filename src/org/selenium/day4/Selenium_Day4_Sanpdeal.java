package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Sanpdeal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Vivient Women Black Plain Flair Georgette Short Dress");
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='img_section'])[5]")).click();
	}

}
