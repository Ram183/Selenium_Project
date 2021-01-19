package org.selenium.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day4_Green_Technology4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		/*WebElement para = driver.findElement(By.xpath("//div[@id='article-wrapper']"));
		System.out.println(para.getText());*/
		
		List<WebElement> list = driver.findElements(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])"));
		for (WebElement x : list) {
			
			System.out.println(x.getText());
			System.out.println("\n");
		}
		
	}

}
