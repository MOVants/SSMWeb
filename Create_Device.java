package selenium.deviceModule.qa;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_Device extends SSMwebForm {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();


@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseUrl = "https://";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

// Create Device
	
@Test
	public void CreateDevice() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Create Device");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Missing IMEI

@Test
	public void MissingIMEI() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(IMEIField)).clear();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing IMEI");
		if (Alias.equals("IMEI required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Missing Alias

@Test
	public void MissingAlias() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(Aliasfield)).clear();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing Alias");
		if (Alias.equals("Alias required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Missing MSISDN (Phone #)

@Test  
	public void MissingMSISDN() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(MSDINfield)).clear();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN or phone number required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// SMS Notification not set

@Test
	public void SMSNotificationNotSet() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device SMS Notification not Set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Authorized Phone number not set 

@Test
	public void AuthorizePhonenumbernotset() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(AuthorizephoneNum)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Authorized Phone number not Set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))

		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Receiving Email not Set

@Test
	public void ReceivingEmailisnotset() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(EmailField)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device receiving Email not Set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Sending Email not Set
	
@Test
	public void SendingEmailnotSet() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();toSMSNotificationTab();
		toDeviceConfigTab();	
		driver.findElement(By.id(SenderEmailField)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device sending email not set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Notification not set

@Test
	public void NotificationListNotSet() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Notification list not set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
		System.out.println("Passed");
		} else {
		System.out.println("Failed");
		}
}

// Alias is duplicate

@Test
	public void AliasisDuplicate() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[2]")).getText();
		createDeviceTab();
		driver.findElement(By.id(Aliasfield)).clear();
		driver.findElement(By.id(Aliasfield)).sendKeys(sCellValue);
		String aliasValue = GetAliasFieldAttribule();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Alias is duplicate");
		if (Alias.equals("Failed to create device. Device with alias \"" + aliasValue + "\" already exists."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Front Camera not set

@Test
	public void FronCameranotSet() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(AuthorizephoneNum)).sendKeys(RandomStringUtils.randomNumeric(11));
		driver.findElement(By.id(SMSNotification)).click();
		driver.findElement(By.id(SMSNotification)).sendKeys(RandomStringUtils.randomNumeric(11));
		driver.findElement(By.id(EmailField)).click();
		driver.findElement(By.id(EmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
		driver.findElement(By.id(SenderEmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
		driver.findElement(By.id(EmailPasswordField)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Front Camera not set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// IMEI existing on other account

@Test
	public void IMEIexistonOtherAccount() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLoginOtherAccount();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[1]")).getText();
		driver.findElement(By.id(Logout)).click();
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(IMEIField)).clear();
		driver.findElement(By.id(IMEIField)).sendKeys(sCellValue);
		String IMEIValue = GetIMEIfieldAttribute();
		toDeviceConfigTab();
		toSMSNotificationTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device IMEI Exist on other account");
		if (Alias.equals("Failed to create device. Device with IMEI \"" + IMEIValue + "\" already registered."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// Device Alias exist on other account

@Test
	public void AliasexistonOtherAccount() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLoginOtherAccount();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[2]")).getText();
		driver.findElement(By.id(Logout)).click();
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(Aliasfield)).clear();
		driver.findElement(By.id(Aliasfield)).sendKeys(sCellValue);
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		System.out.println("Device alias exists on other account");
		String Alias = driver.findElement(By.id(Message)).getText();
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
			
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

// SMS and Phone configuration is not set

@Test
	public void SMSandPhoneConfigurationisnotset() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("SMS and Phone Configuration is not set");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully created."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

}

// Cancel creating device

@Test
	public void CancelCreatingNewDevice() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		toSMSNotificationTab();
		toDeviceConfigTab();
		Thread.sleep(3000);
		driver.findElement(By.id(CancelBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Cancel creating device");
		if (Alias.equals(""))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}


// IMEI duplicate

@Test
	public void IMEIisduplicate() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[1]")).getText();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(IMEIField)).clear();
		driver.findElement(By.id(IMEIField)).sendKeys(sCellValue);
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("IMEI is Duplicate");
		if (Alias.equals("Failed to create device. Device with IMEI \""+ IMEIValue + "\" already registered."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

}

// Invalid IMEI

@Test
	public void InvalidIMEI() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(IMEIField)).clear();
		driver.findElement(By.id(IMEIField)).sendKeys(RandomStringUtils.randomAlphanumeric(15));
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Invalid IMEI");
		if (Alias.equals("Value for IMEI must be a number."))
		
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

}

// Invalid MSISDN

@Test
	public void Invalid_MSISDN() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		createDeviceTab();
		driver.findElement(By.id(MSDINfield)).clear();
		driver.findElement(By.id(MSDINfield)).sendKeys(RandomStringUtils.randomAlphanumeric(15));
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Invalid MSISDN");
		if (Alias.equals("MSISDN must be a number."))
		
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

private String GetAliasFieldAttribule() {
	String aliasValue = driver.findElement(By.id(Aliasfield)).getAttribute("value");
	return aliasValue;
}

private String GetIMEIfieldAttribute() {
	String IMEIValue = driver.findElement(By.id(IMEIField)).getAttribute("value");
	return IMEIValue;
}

private void toLoginOtherAccount() {
	driver.findElement(By.id(Usernamefield)).sendKeys("altairj");
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
}

private void toLogin() {
	driver.get(baseUrl + "/satellite/login.jsf");
	driver.findElement(By.id(Usernamefield)).sendKeys("ants");
	driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	driver.findElement(By.id(LoginBtn)).click();
}

private void toMobileDeviceSpan() {
	driver.findElement(By.xpath(OthersSpan)).click();
	driver.findElement(By.xpath(OthersSpan)).click();
	driver.findElement(By.xpath(AssetsSpan)).click();
	driver.findElement(By.xpath(Mobiledevicespan)).click();
}

private void createDeviceTab() {
	driver.findElement(By.id(CreateDevice)).click();
	driver.findElement(By.id(IMEIField)).sendKeys(RandomStringUtils.randomNumeric(15));
	driver.findElement(By.id(MSDINfield)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(Aliasfield)).sendKeys(RandomStringUtils.randomAlphanumeric(5));
	driver.findElement(By.id(DescriptionField)).sendKeys(RandomStringUtils.randomAlphanumeric(50));
}

private void toSMSNotificationTab() {
	driver.findElement(By.linkText(NotificationTab)).click();
	driver.findElement(By.xpath(LockScreen)).click();
	driver.findElement(By.xpath(LowBattery)).click();
	driver.findElement(By.xpath(MaxIdletime)).click();
	driver.findElement(By.xpath(GeofenceArrival)).click();
	driver.findElement(By.xpath(GeofenceDeparture)).click();
	driver.findElement(By.xpath(DeviceOnline)).click();
	driver.findElement(By.xpath(SimChange)).click();
	driver.findElement(By.xpath(Alarm)).click();
}

private void toDeviceConfigTab() {
	driver.findElement(By.linkText(ConfigurationTab)).click();
	driver.findElement(By.id(AuthorizephoneNum)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(SMSNotification)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(EmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
	driver.findElement(By.id(SenderEmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
	driver.findElement(By.id(EmailPasswordField)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
	driver.findElement(By.xpath(FrontCam)).click();
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