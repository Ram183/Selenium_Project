package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day3_Toolsqa {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://toolsqa.com/automation-practice-form/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("TitleName: " + title);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Ramkumar");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Angurajan");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("Ramkumar.rx135@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
		gender.click();
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9790732601");
		
		WebElement subjects = driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[5]"));
		subjects.click();
						
		/*WebElement subjectText = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
		subjectText.sendKeys("Computer Science");
		*/
		
		WebElement hobbies = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
		hobbies.click();
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("No:10 Pillarkovil street, 1St sector, K.k.Nagar, Chennai - 600083");
		
		WebElement state = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
		
		Actions a = new Actions(driver);
		
		a.click();
		
		a.sendKeys(state, "NCR");	
		
		/*WebElement city = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[2]"));
		
		act.click(city).perform();
		
		act.sendKeys(city, "Delhi").perform();
		
		
		WebElement submit = driver.findElement(By.id("submit"));
		act.click(submit).perform();
		*/
	}

}
