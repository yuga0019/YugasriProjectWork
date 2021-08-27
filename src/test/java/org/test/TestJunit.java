package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJunit {

	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenJunit\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}
	
	@Before
	public void timeBeforeEntry() throws InterruptedException {
		Date d = new Date();
		System.out.println(d);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
}
	
	@Test
	public void usernameAndPassword() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenJunit\\Driver1\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		boolean contains = title.contains("Facebook");
		System.out.println(contains);
		Assert.assertTrue(contains);
		System.out.println("Control is in FB page");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("yugalaks");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("12345");
		
	}
	
	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@After
	public void  timeAfterEntry() throws InterruptedException {
		Date d2 = new Date();
		System.out.println(d2);
		Thread.sleep(3000);
		Dimension d1 = new Dimension(250,250);
		driver.manage().window().setSize(d1);
		
		
		
		
	}
}
