package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2_Demo_Automation {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("TitleName: " + title);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Ramkumar");
	
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Angurajan");
	
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("No: 10 pillarkovil street, 1st sector, K.k.Nagar. Chennai - 600083");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		emailAddress.sendKeys("Ramkumar.rx135@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneNumber.sendKeys("9790732601");
		
		WebElement radioButton = driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[1]"));
		radioButton.click();
		
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobbies.click();
		
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();
		
		WebElement languageChoosed = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		languageChoosed.click();
		
		WebElement skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		skills.sendKeys("Java");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		country.sendKeys("India");
		
		WebElement selectCountry = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
		selectCountry.click();
		
		WebElement selectCountryClick = driver.findElement(By.xpath("(//li[@role='treeitem'])[6]"));
		selectCountryClick.click();
		
		WebElement dobYear = driver.findElement(By.xpath("//select[@id='yearbox']"));
		dobYear.sendKeys("2015");
		
		WebElement dobMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		dobMonth.sendKeys("October");
		
		WebElement dobDate = driver.findElement(By.xpath("//select[@id='daybox']"));
		dobDate.sendKeys("29");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys("Ram@123a");
		
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmPassword.sendKeys("Ram@123a");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
		
	}

}
