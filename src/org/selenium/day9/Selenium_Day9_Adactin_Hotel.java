package org.selenium.day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Day9_Adactin_Hotel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\workspace\\Selenium_Package\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("Ramcrazy18");

		String userNameattribute = userName.getAttribute("value");

		System.out.println(userNameattribute);

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Ram@123a");

		String passwordattribute = userName.getAttribute("value");

		System.out.println(passwordattribute);

		WebElement login = driver.findElement(By.id("login"));

		login.click();

		WebElement welcomeNote = driver.findElement(By.id("username_show"));

		String attribute = welcomeNote.getAttribute("value");

		System.out.println(attribute);

		WebElement location = driver.findElement(By.id("location"));

		Select select = new Select(location);

		boolean multiple = select.isMultiple();

		System.out.println(multiple);

		select.selectByValue("London");

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s = new Select(hotels);

		s.selectByVisibleText("Hotel Hervey");

		WebElement roomType = driver.findElement(By.id("room_type"));

		Select s1 = new Select(roomType);

		s1.selectByValue("Deluxe");

		WebElement roomNo = driver.findElement(By.id("room_nos"));

		Select s2 = new Select(roomNo);

		s2.selectByVisibleText("6 - Six");

		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));

		Select s3 = new Select(adultsPerRoom);

		s3.selectByIndex(3);

		WebElement childPerRoom = driver.findElement(By.id("child_room"));

		Select s4 = new Select(childPerRoom);

		s4.selectByValue("2");

		WebElement search = driver.findElement(By.id("Submit"));

		search.click();

		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));

		radioButton.click();

		WebElement continueButton = driver.findElement(By.id("continue"));

		continueButton.click();

		WebElement firstName = driver.findElement(By.id("first_name"));

		firstName.sendKeys("D");

		WebElement lastName = driver.findElement(By.id("last_name"));

		lastName.sendKeys("DD");

		WebElement address = driver.findElement(By.id("address"));

		address.sendKeys("Dubai, Dubai Main road, Dunbai Kuruku santhu, No6 vivekanandar street ");

		WebElement creditCardNum = driver.findElement(By.id("cc_num"));

		creditCardNum.sendKeys("1234567890123456");

		WebElement creditCardType = driver.findElement(By.id("cc_type"));

		Select s5 = new Select(creditCardType);

		s5.selectByVisibleText("VISA");

		WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));

		Select s6 = new Select(expiryMonth);

		s6.selectByValue("10");

		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));

		Select s7 = new Select(expiryYear);

		s7.selectByValue("2022");

		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));

		cvvNumber.sendKeys("123");
	
		WebElement bookNow = driver.findElement(By.id("book_now"));

		bookNow.click();
		
		WebDriverWait w = new WebDriverWait(driver, 25);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		
		WebElement orderNo = driver.findElement(By.id("order_no"));
		
		String orderAttribute = orderNo.getAttribute("value");
		
		System.out.println("OrderId: " + orderAttribute);
		
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		
		logOut.click();
		
		driver.quit();
		
	}

}
