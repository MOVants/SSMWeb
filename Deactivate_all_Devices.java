package com.test.selenium;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Deactivate_all_Devices {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	private String Usernamefield = "loginForm:usernameField";
	private String Passwordfield = "loginForm:passwordField";
	private String LoginBtn = "loginForm:j_idt12";
	private String OthersSpan = "//div[@id='mainForm:navigation']/ul/li[3]/a/span[2]";
	private String AssetsSpan = "//div[@id='mainForm:navigation']/ul/li[3]/ul/li[2]/a/span[2]";
	private String Mobiledevicespan = "//div[@id='mainForm:navigation']/ul/li[3]/ul/li[2]/ul/li[6]/a/span";
	private String IMEIField = "mainForm:tabView:imeiField";
	private String MSDINfield = "mainForm:tabView:msisdnField";
	private String Aliasfield = "mainForm:tabView:j_idt529";
	private String EditBtn = "mainForm:mobileDeviceTable:0:j_idt512";
	private String DeactivateBtn  = "mainForm:j_idt648"; 
	private String ConfirmBtn  = "mainForm:j_idt653";
	private String Message = "mainForm:j_idt254_container";
	
@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://172.16.0.133/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
	public void ModifyStatus() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		driver.findElement(By.id(Usernamefield)).clear();
		driver.findElement(By.id(Usernamefield)).sendKeys("marvin");
		driver.findElement(By.id(Passwordfield)).clear();
		driver.findElement(By.id(Passwordfield)).sendKeys("admin");
		driver.findElement(By.id(LoginBtn)).click();
		driver.findElement(By.xpath(OthersSpan)).click();
		driver.findElement(By.xpath(OthersSpan)).click();
		driver.findElement(By.xpath(AssetsSpan)).click();
		driver.findElement(By.xpath(Mobiledevicespan)).click();  
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		String IMEIValue = driver.findElement(By.id(IMEIField)).getAttribute("value");
		driver.findElement(By.id(MSDINfield)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = driver.findElement(By.id(Aliasfield)).getAttribute("value");
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify models only");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully deactivated."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
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