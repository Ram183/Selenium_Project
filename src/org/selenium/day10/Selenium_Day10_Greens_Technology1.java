package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day10_Greens_Technology1 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement coursesTab = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(coursesTab).perform();
		
		WebElement pythonTab = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
	
		a.doubleClick(pythonTab).perform();
		
		WebElement exploreCurriculum = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		
		a.contextClick(exploreCurriculum).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
	}

}
