package org.selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day6_Snap_Deal {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.snapdeal.com/offers/quirky");

		driver.manage().window().maximize();

		WebElement searchBar = driver.findElement(By.id("inputValEnter"));
		searchBar.sendKeys("Watch Men");

		WebElement searchButtonClick = driver
				.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchButtonClick.click();

		WebElement watch = driver.findElement(By.xpath("(//img[@class='product-image '])[2]"));

		Actions act = new Actions(driver);

		act.contextClick(watch).perform();

		act.sendKeys(watch, "e").perform();

	}

}
