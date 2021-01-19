package org.selenium.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day6_Greens_Tech_In_1 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		WebElement modelResumes = driver.findElement(By.id("heading201"));
		modelResumes.click();

		WebElement resumeModel = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[4]"));

		Actions act = new Actions(driver);

		act.contextClick(resumeModel).perform();

		Robot r = new Robot();

		for (int i = 0; i < 4; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
