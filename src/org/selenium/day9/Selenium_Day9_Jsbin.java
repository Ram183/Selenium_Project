package org.selenium.day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Jsbin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			if (i%2==0) {
				
				s.selectByIndex(i);
				
			}
			
			}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement x : allSelectedOptions) {
			System.out.println(x.getText());
		}
		
		if (options.removeAll(allSelectedOptions)) {
			
			for (WebElement o : options) {
				
				System.out.println("Not Selected Value: " + o.getText());
			}
	
		}
		
		driver.quit();
		
	}

}
