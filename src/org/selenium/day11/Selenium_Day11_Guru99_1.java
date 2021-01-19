package org.selenium.day11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day11_Guru99_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement tables = driver.findElement(By.xpath("//table[@border='l']"));
		
		List<WebElement> rows = tables.findElements(By.tagName("tr"));
	
		for (int i = 0; i < rows.size(); i++) {
			
		WebElement row = rows.get(i);
			
			if (i==0) {
				
				System.out.println(row.getText());
				break;
			}
			}
			
		driver.quit();
			
		}

	
}

