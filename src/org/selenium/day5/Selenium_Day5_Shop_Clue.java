package org.selenium.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Day5_Shop_Clue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mobilesAndMore = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobilesAndMore).perform();;
		
		WebElement samsungMobile = driver.findElement(By.xpath("(//a[text()='Samsung'])[1]"));
		
		samsungMobile.click();
	
		Thread.sleep(3000);
		
		WebElement priceRange = driver.findElement(By.xpath("//*[@id=\'sort_price_fct\']/li[2]/label"));
		
		priceRange.click();
		

		
	}

}
