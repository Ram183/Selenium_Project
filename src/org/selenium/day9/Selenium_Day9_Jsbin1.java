package org.selenium.day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day9_Jsbin1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		
		s.selectByIndex(3);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();
		
		System.out.println(text);
		
		driver.quit();
		
	}

}
