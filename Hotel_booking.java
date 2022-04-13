package com.Miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_booking {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("saranrockers");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("S0a0r0a0n@");
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	WebElement location = driver.findElement(By. id("location"));
	Select s= new Select(location);
	s.selectByValue("London");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select a =new Select(hotel);
	a.selectByVisibleText("Hotel Sunshine");
	
	WebElement room = driver.findElement(By.name("room_type"));
	Select d=new Select(room);
	d.selectByIndex(4);
	
	WebElement rooms = driver.findElement(By.id("room_nos"));
	Select f=new Select(rooms);
	f.selectByIndex(5);
	
	WebElement startdate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	startdate.clear();
	startdate.sendKeys("25/02/2022");
	
	
	WebElement lastdate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	lastdate.clear();
	lastdate.sendKeys("28/02/2022");
	
	WebElement roo = driver.findElement(By.id("adult_room"));
	Select j=new Select(roo);
	j.selectByIndex(4);
	
	WebElement child = driver.findElement(By.name("child_room"));
	Select k =new Select(child);
	k.selectByIndex(2);
	
	WebElement submit = driver.findElement(By.id("Submit"));
	submit.click();
	
	WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
	radio.click();
	
	WebElement abc = driver.findElement(By.id("continue"));
	abc.click();
	
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	name.sendKeys("saranyan");
	
	WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	last.sendKeys("senthil");
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("no 316,goodvilecourt,chennai");
	
	WebElement card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	card.sendKeys("1234567893216546");
	
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	Select l=new Select(cardtype);
	l.selectByIndex(1);
	
	WebElement expMonth = driver.findElement(By.name("cc_exp_month"));
	Select z=new Select(expMonth);
	z.selectByIndex(6);;
	
	WebElement expYear = driver.findElement(By.name("cc_exp_year"));
	Select x=new Select(expYear);
	x.selectByVisibleText("2022");
	
	WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
	cvv.sendKeys("2031");
	
	WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	book.click();
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\WELCOME\\eclipse-workspace\\Selenium_Testing\\Screenshot\\Booking.png");
	FileUtils.copyFile(src, des);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
