package org.selenium.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Google_Com {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();

		System.out.println("TitleName: " + title);

		WebElement searchText = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		searchText.sendKeys("GreensTechnology");

		WebElement searchClick = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));

		searchClick.click();

		WebElement searchClick1 = driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]"));

		searchClick1.click();

		driver.close();

	}

}
