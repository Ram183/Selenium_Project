package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Day3_Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("TitleName: " + title);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");

		WebElement searchButtonClick = driver.findElement(By.xpath("(//input[@class='nav-input'])[2]"));
		searchButtonClick.click();

	}

}
