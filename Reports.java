package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reports {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	private String Usernamefield = "loginForm:usernameField";
	private String Passwordfield = "loginForm:passwordField";
	private String LoginBtn = "loginForm:j_idt12";


@Before
	public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  baseUrl = "https://172.16.0.133/";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

//Login only

@Test
public void VehicleFleet() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).clear();
	driver.findElement(By.id(Usernamefield)).sendKeys("marvin");
	driver.findElement(By.id(Passwordfield)).clear();
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
	driver.findElement(By.xpath("//div[@id='mainForm:navigation']/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='mainForm:navigation']/ul/li[2]/a/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='mainForm:navigation']/ul/li[2]/ul/li[2]/a/span")).click();
    driver.findElement(By.id("mainForm:j_idt220")).click();
    driver.findElement(By.id("mainForm:vehicleGroupSelect_label")).click();
    driver.findElement(By.xpath("//div[@id='mainForm:vehicleGroupSelect_panel']/div/ul/li")).click();
    driver.findElement(By.xpath("//table[@id='mainForm:intervalPreference']/tbody/tr/td/div/div[2]/span")).click();
    driver.findElement(By.id("mainForm:intervalPreference:0")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.linkText("5")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.linkText("19")).click();
    driver.findElement(By.id("mainForm:fleetReportGenerateButton")).click();
    driver.findElement(By.id("mainForm:downloadGraphButton")).click();
    Thread.sleep(6000);
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