package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day3_Greens_Tech_In {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		WebElement interviewQuestions = driver.findElement(By.id("heading20"));
		interviewQuestions.click();

		WebElement ctsInterviewQuestions = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		ctsInterviewQuestions.click();

	}

}
