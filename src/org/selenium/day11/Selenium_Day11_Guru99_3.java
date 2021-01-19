package org.selenium.day11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day11_Guru99_3 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement tables = driver.findElement(By.xpath("//table[@border='l']"));
		
		WebElement row = tables.findElement(By.xpath("//table[@border='l']/tbody/tr[2]"));
			
		WebElement cell = row.findElement(By.xpath("//table[@border='l']/tbody/tr[2]/td[2]"));
		
		System.out.println("Fourth Cell Value of WebTable: " + cell.getText());
			
		driver.quit();
	}

}
