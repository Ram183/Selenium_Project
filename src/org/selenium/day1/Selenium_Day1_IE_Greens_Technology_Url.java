package org.selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_Day1_IE_Greens_Technology_Url {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("TitleName of Current Url : " + title);
		
		driver.quit();
		
	}

}
