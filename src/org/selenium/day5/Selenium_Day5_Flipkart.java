package org.selenium.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day5_Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		closeButton.click();
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement homeAndFurniture = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));

		Thread.sleep(3000);
		
		act.moveToElement(homeAndFurniture).perform();
		
		Thread.sleep(3000);
		
		WebElement bathTowels= driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		
		bathTowels.click();
		
		Thread.sleep(3000);
		
		WebElement productInfo = driver.findElement(By.xpath("(//a[@title='Flipkart SmartBuy Cotton 350 GSM Bath Towel'])[1]"));
		
		System.out.println(productInfo.getText());
		
	}

}
