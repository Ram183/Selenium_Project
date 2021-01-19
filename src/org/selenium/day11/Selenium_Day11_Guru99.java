package org.selenium.day11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day11_Guru99 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement tables = driver.findElement(By.xpath("//table[@border='l']"));
		
	// METHOD 1 (To Get The Value In Table Itself)
		/*String text = tables.getText();
		
		System.out.println(text);*/
		
		// OR
		
		List<WebElement> rows = tables.findElements(By.tagName("tr"));
		
		
		// METHOD 2 (To Get The Value In Row Directly)
		/*for (WebElement x : rows) {
			
			String rowText = x.getText();
			System.out.println(rowText);
			
		}*/
		
		
		//METHOD 3 (To Get The Value In Order)
		
		for (int i = 0; i < rows.size(); i++) {
		
			WebElement row = rows.get(i);
			
			List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < cells.size(); j++) {
				
				WebElement cell = cells.get(j);
				
				String text = cell.getText();
				System.out.println(text);
			}
		}
		driver.quit();
		
	}

}
