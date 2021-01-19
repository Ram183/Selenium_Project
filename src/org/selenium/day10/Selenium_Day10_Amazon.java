package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class Selenium_Day10_Amazon {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

		searchBar.sendKeys("iphone X");

		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

		searchButton.click();

		WebElement product = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none'])[15]"));

		Actions a = new Actions(driver);

		a.contextClick(product).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window Id: " + windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Child Windows Id: " + windowHandles);
		
		for (String x : windowHandles) {
			
			if (!windowHandle.equals(windowHandles)) {
				
				driver.switchTo().window(x);
			}
			
		}
		
		WebElement priceOfProduct = driver.findElement(By.xpath("//span[text()='Currently unavailable.']"));
		
		String text = priceOfProduct.getText();
		
		System.out.println("Price of the product: " + text);
		
		driver.quit();

	}

}
