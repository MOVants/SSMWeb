package com.test.selenium;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginOnly {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	private String Usernamefield = "loginForm:usernameField";
	private String Passwordfield = "loginForm:passwordField";
	private String LoginBtn = "loginForm:j_idt12";
	private String ShowGeofence = "//div[@id='mainForm:j_idt308']/div[2]/span";
	
@Before
	public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  baseUrl = "https://172.16.0.133/";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

// Login only

@Test
public void Login() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).clear();
	driver.findElement(By.id(Usernamefield)).sendKeys("marvin");
	driver.findElement(By.id(Passwordfield)).clear();
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
	driver.findElement(By.linkText("Monitor")).click();
	Thread.sleep(6000);
}

//Invalid Username

@Test
public void InvalidUsername() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).clear();
	driver.findElement(By.id(Usernamefield)).sendKeys("invalid");
	driver.findElement(By.id(Passwordfield)).clear();
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
	driver.findElement(By.linkText("Monitor")).click();
	Thread.sleep(6000);
}

//Invalid Password

@Test
public void InvalidPassword() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).clear();
	driver.findElement(By.id(Usernamefield)).sendKeys("marvin");
	driver.findElement(By.id(Passwordfield)).clear();
	driver.findElement(By.id(Passwordfield)).sendKeys("invalid");
	driver.findElement(By.id(LoginBtn)).click();
	driver.findElement(By.linkText("Monitor")).click();
	Thread.sleep(6000);
}

//Invalid Show Geofence

@Test
public void ShowGeofence() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).clear();
	driver.findElement(By.id(Usernamefield)).sendKeys("marvin");
	driver.findElement(By.id(Passwordfield)).clear();
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
	Thread.sleep(6000);
	driver.navigate().refresh();
	driver.findElement(By.id(ShowGeofence)).click();
	driver.findElement(By.xpath(ShowGeofence)).click();
	Thread.sleep(7000);
}

@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
			}
	}
	private void fail(String verificationErrorString) {
	}
}