package selenium.deviceModule.qa;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.lang3.RandomStringUtils;

public class Modify_Device extends SSMwebForm {
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

@Test
	public void ModifyDevice() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		tomodifyDeviceTab();
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

@Test
	public void ModifyAliasOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(Aliasfield)).clear();
		driver.findElement(By.id(Aliasfield)).sendKeys(RandomStringUtils.randomAlphanumeric(5));
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify Alias only");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifyStatus() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DeactivateBtn)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
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

@Test
	public void ModifyDiscription() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(DescriptionField)).clear();
		driver.findElement(By.id(DescriptionField)).sendKeys(RandomStringUtils.randomAlphanumeric(20));
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify description");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifyAuthorizedPhoneNoListOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(AuthorizephoneNum)).clear();
		driver.findElement(By.id(AuthorizephoneNum)).sendKeys(RandomStringUtils.randomNumeric(11));
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify Authorized phone number only");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifyReceivingEmailOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(EmailField)).clear();
		driver.findElement(By.id(EmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify receiving email only");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void SendingEmailOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(EmailField)).clear();
		driver.findElement(By.id(SenderEmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify sending email only");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifySendingEmailPasswordOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(EmailPasswordField)).clear();
		driver.findElement(By.id(EmailPasswordField)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify sending password");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifySMSNotificationNoListOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify SMS notification");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ModifyUseofFrontCameraOnly() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).click();
		driver.findElement(By.id(Aliasfield)).click();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.xpath(FrontCam)).click();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Modify  use of front camera");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void Missing_Alias() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(Aliasfield)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Missing Alias");
		if (Alias.equals("Alias required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

}

@Test
	public void Missing_IMEI() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(IMEIField)).clear();
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

@Test
	public void Missing_MSISDN() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(MSDINfield)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}


@Test
	public void Missing_AuthorizedPhoneNo() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(AuthorizephoneNum)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN required."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void Missing_SMSNotificationNo() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(SMSNotification)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN required."))
		{
		System.out.println("Passed!");
		} else {
		System.out.println("Failed!");
	}
}

@Test
	public void Missing_ReceivingEmail() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(EmailField)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN required."))
		{
		System.out.println("Passed!");
		} else {
		System.out.println("Failed!");
	}
}

@Test
	public void Missing_SendingEmail() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.linkText(ConfigurationTab)).click();
		driver.findElement(By.id(SenderEmailField)).clear();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device Missing MSISDN");
		if (Alias.equals("MSISDN required."))
		{
		System.out.println("Passed!");
		} else {
		System.out.println("Failed!");
	}
}

@Test
	public void SMSNotificationNoListisnotModified() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		tomodifyDeviceTab();
		String aliasValue = GetAliasFieldAttribule();
		String IMEIValue = GetIMEIfieldAttribute();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("SMS Notification no. list is not modified");
		if (Alias.equals("Device \"" + aliasValue + " (" + IMEIValue + ")" + "\" is successfully updated."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void CancelUpdatingDevice() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		tomodifyDeviceTab();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(CancelBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Cancel Updating Device");
		if (Alias.equals(""))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void Deviceisduplicate() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(".//*[@id='mainForm:mobileDeviceTable_data']/tr[2]/td[1]")).getText();
		tomodifyDeviceTab();
		driver.findElement(By.id(IMEIField)).clear();
		driver.findElement(By.id(IMEIField)).sendKeys(sCellValue);
		String IMEIValue = GetIMEIfieldAttribute();
		toSMSNotificationTab();
		toDeviceConfigTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Device is duplicate");
		if (Alias.equals("Failed to update device. Device with IMEI \""+ IMEIValue + "\" already registered."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void ActivateDevice() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		driver.findElement(By.id(EditBtn)).click();
		driver.findElement(By.id(Active)).click();
		driver.findElement(By.id(ConfirmBtn)).click();
		Thread.sleep(3000);	
}

private String GetAliasFieldAttribule() {
	String aliasValue = driver.findElement(By.id(Aliasfield)).getAttribute("value");
	return aliasValue;
}

private String GetIMEIfieldAttribute() {
	String IMEIValue = driver.findElement(By.id(IMEIField)).getAttribute("value");
	return IMEIValue;
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

private void tomodifyDeviceTab() {
	driver.findElement(By.id(EditBtn)).click();
	driver.findElement(By.id(IMEIField)).clear();
	driver.findElement(By.id(IMEIField)).sendKeys(RandomStringUtils.randomNumeric(15));
	driver.findElement(By.id(MSDINfield)).clear();
	driver.findElement(By.id(MSDINfield)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(Aliasfield)).clear();
	driver.findElement(By.id(Aliasfield)).sendKeys(RandomStringUtils.randomAlphanumeric(5));
	driver.findElement(By.id(DescriptionField)).clear();
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
	driver.findElement(By.id(AuthorizephoneNum)).clear();
	driver.findElement(By.id(AuthorizephoneNum)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(SMSNotification)).clear();
	driver.findElement(By.id(SMSNotification)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(EmailField)).clear();
	driver.findElement(By.id(EmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
	driver.findElement(By.id(SenderEmailField)).clear();
	driver.findElement(By.id(SenderEmailField)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@test.com");
	driver.findElement(By.id(EmailPasswordField)).clear();
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