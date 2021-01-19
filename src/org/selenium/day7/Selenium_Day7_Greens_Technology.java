package org.selenium.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day7_Greens_Technology {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File sc = s.getScreenshotAs(OutputType.FILE);
		
		File de = new File("C:\\Users\\Ram\\workspace\\Selenium_Package\\screenshot\\GreensTechnologyHomePage.jpg");
		
		FileUtils.copyFile(sc, de);
		
	}

}
