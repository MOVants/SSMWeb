package selenium.deviceModule.qa;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupGlobalConfiguration extends SSMwebForm {
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
	 public void GlobalConfiguration() throws Exception {
	    driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
	    toSettingsSpan();
		toMobileDeviceTab();
		toVehicleSettingTab();
		toPersonnelSettingTab();
	    driver.findElement(By.id(SaveConfogBtn)).click();
	    Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Global Configuration");
		if (Alias.equals("System configuration of account Urban2 is updated."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void InvalidPhoneNolistforautoanswercall() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(AuthorizedPhoneNumberList)).clear();
	   driver.findElement(By.id(AuthorizedPhoneNumberList)).sendKeys(RandomStringUtils.randomAlphanumeric(11));
	   toVehicleSettingTab();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Phone No. list for auto answer call");
	   if (Alias.equals("Mobile/Phone No value is invalid. Only numbers and comma are allowed in the field."))
	   {
		  System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidPhoneNoforSMSNotifications() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(PhoneNumbertonotify)).clear();
	   driver.findElement(By.id(PhoneNumbertonotify)).sendKeys(RandomStringUtils.randomAlphanumeric(11));
	   toVehicleSettingTab();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Global Configuration");
		if (Alias.equals("Mobile/Phone No value is invalid. Only numbers and comma are allowed in the field."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void InvalidKeywordforRebootRequest() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(RebootKeyword)).clear();
	   driver.findElement(By.id(RebootKeyword)).sendKeys(RandomStringUtils.randomAlphanumeric(3) + " reboot");
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Invalid Keyword for Reboot Request");
		if (Alias.equals("Spaces is not allowed."))
		{
		System.out.println("Passed!");
		} else {
		System.out.println("Failed!");
		}
}

@Test
	public void InvalidCameraCaptureKeyword() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(CameraCaptureKey)).clear();
	   driver.findElement(By.id(CameraCaptureKey)).sendKeys(RandomStringUtils.randomAlphanumeric(3) + " capture");
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
		String Alias = driver.findElement(By.id(Message)).getText();
		System.out.println("Invalid Camera Capture Keyword");
		if (Alias.equals("Spaces is not allowed."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void InvalidKeywordforDeviceStatusRequest() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(PhoneStatKey)).clear();
	   driver.findElement(By.id(PhoneStatKey)).sendKeys(RandomStringUtils.randomAlphanumeric(3) + " stat");
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Keyword for Device Status Request");
	   if (Alias.equals("Spaces is not allowed."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidKeywordforDeviceConfigurationSync() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.id(ConfigSyncKey)).clear();
	   driver.findElement(By.id(ConfigSyncKey)).sendKeys(RandomStringUtils.randomAlphanumeric(3) + " sync");
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Keyword for Device Configuration Sync");
	   if (Alias.equals("Spaces is not allowed."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void InvalidMinimumFuelLevel() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.xpath(VehicleSettingsTab)).click();
	   driver.findElement(By.id(MinimumFuelLevel)).clear();
	   driver.findElement(By.id(MinimumFuelLevel)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Minimum Fuel Level");
	   if (Alias.equals("Minimum Fuel Level is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidSuddenFuelDrop() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   driver.findElement(By.xpath(VehicleSettingsTab)).click();
	   driver.findElement(By.id(SuddenFuelChange)).clear();
	   driver.findElement(By.id(SuddenFuelChange)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Sudden Fuel Drop");
	   if (Alias.equals("Sudden Fuel Changed is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}  

@Test
	public void InvalidReceivingEmailAddress() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan(); 
	   toMobileDeviceTab();
	   driver.findElement(By.id(ReceivingEmail)).clear();
	   driver.findElement(By.id(ReceivingEmail)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
	   toVehicleSettingTab();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Receiving Email Address");
	   if (Alias.equals("You have entered an invalid Receiving Email Address."))
	
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
}

@Test
	public void InvalidSendingEmailAddress() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toSettingsSpan(); 
		toMobileDeviceTab();
		driver.findElement(By.id(SendingEmail)).clear();
		driver.findElement(By.id(SendingEmail)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
		toVehicleSettingTab();
		toPersonnelSettingTab();
		driver.findElement(By.id(SaveBtn)).click();
		Thread.sleep(3000);
		String Alias = driver.findElement(By.id(SaveConfogBtn)).getText();
		System.out.println("Invalid Sending Email Address");
		if (Alias.equals("You have entered an invalid Sending Email Address."))
		{
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
	}
}

@Test
	public void InvalidVehicleMaximumSpeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(MaximumSpeed)).clear();
	   driver.findElement(By.id(MaximumSpeed)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Vehicle Maximum Speed");
	   if (Alias.equals("Vehicle Maximum Speed(Km/h) is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidVehicleNormalSpeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(NormalSpeed)).clear();
	   driver.findElement(By.id(NormalSpeed)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Vehicle Normal Speed");
	   if (Alias.equals("Vehicle Normal Speed(Km/h) is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidMaximumIdleTime() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(MaxIdleTime)).clear();
	   driver.findElement(By.id(MaxIdleTime)).sendKeys(RandomStringUtils.randomAlphanumeric(4));
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Maximum Idle Time");
	   if (Alias.equals("Vehicle maximum idle time is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidMobileDeviceMinimumBatteryLevel() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(MobileDeviceMinimumBatteryLevel)).clear();
	   driver.findElement(By.id(MobileDeviceMinimumBatteryLevel)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Mobile Device Minimum Battery Level");
	   if (Alias.equals("Client minimum battery level is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void InvalidVehicleMinimumSpeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(MinimumSpeed)).clear();
	   driver.findElement(By.id(MinimumSpeed)).sendKeys(RandomStringUtils.randomAlphanumeric(2));
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Invalid Vehicle Minimum Speed");
	   if (Alias.equals("Vehicle Minimum Speed(Km/h) is invalid. Only numbers are allowed in the field."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void MissingVehicleMinimumSpeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(MinimumSpeed)).clear();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Missing Vehicle Minimum Speed");
	   if (Alias.equals("Vehicle Minimum Speed required."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void MissingVehicleNormalSpeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(NormalSpeed)).clear();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Missing Vehicle Normal Speed");
	   if (Alias.equals("Vehicle Normal Speed required."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

@Test
	public void MissingVehicleMaximumspeed() throws Exception {
	   driver.get(baseUrl + "/satellite/login.jsf");
	   toLogin();
	   toSettingsSpan();
	   toMobileDeviceTab();
	   toVehicleSettingTab();
	   driver.findElement(By.id(MaximumSpeed)).clear();
	   toPersonnelSettingTab();
	   driver.findElement(By.id(SaveConfogBtn)).click();
	   Thread.sleep(3000);
	   String Alias = driver.findElement(By.id(Message)).getText();
	   System.out.println("Missing Vehicle Maximum speed");
	   if (Alias.equals("Vehicle Maximum Speed required."))
	   {
		   System.out.println("Passed!");
	   } else {
		   System.out.println("Failed!");
	   }
}

private void toLogin() {
	   driver.findElement(By.id(Usernamefield)).sendKeys("ants");
	   driver.findElement(By.id(Passwordfield)).sendKeys("admin");
	   driver.findElement(By.id(LoginBtn)).click();
}

private void toSettingsSpan() {
	   driver.findElement(By.xpath(OthersSpan)).click();
	   driver.findElement(By.xpath(OthersSpan)).click();
	   driver.findElement(By.xpath(Settingsspan)).click();
}

private void toMobileDeviceTab() {
	driver.findElement(By.xpath(PhoneSetting)).click();
	driver.findElement(By.id(AuthorizedPhoneNumberList)).clear();
	driver.findElement(By.id(AuthorizedPhoneNumberList)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(PhoneNumbertonotify)).clear();
	driver.findElement(By.id(PhoneNumbertonotify)).sendKeys(RandomStringUtils.randomNumeric(11));
	driver.findElement(By.id(ReceivingEmail)).clear();
	driver.findElement(By.id(ReceivingEmail)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@safesat.com.ph");
	driver.findElement(By.id(SendingEmail)).clear();
	driver.findElement(By.id(SendingEmail)).sendKeys(RandomStringUtils.randomAlphanumeric(6) + "@safesat.com.ph");
	driver.findElement(By.id(SendingEmailPwd)).clear();
	driver.findElement(By.id(SendingEmailPwd)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
	driver.findElement(By.id(CameraCaptureKey)).clear();
	driver.findElement(By.id(CameraCaptureKey)).sendKeys(RandomStringUtils.randomAlphanumeric(4));
	driver.findElement(By.id(RebootKeyword)).clear();
	driver.findElement(By.id(RebootKeyword)).sendKeys(RandomStringUtils.randomAlphanumeric(4));
	driver.findElement(By.id(PhoneStatKey)).clear();
	driver.findElement(By.id(PhoneStatKey)).sendKeys(RandomStringUtils.randomAlphanumeric(4));
	driver.findElement(By.id(ConfigSyncKey)).clear();
	driver.findElement(By.id(ConfigSyncKey)).sendKeys(RandomStringUtils.randomAlphanumeric(4));
}

private void toVehicleSettingTab() {
	driver.findElement(By.xpath(VehicleSettingsTab)).click();
	driver.findElement(By.id(MaximumSpeed)).clear();
	driver.findElement(By.id(MaximumSpeed)).sendKeys(RandomStringUtils.randomNumeric(2));
	driver.findElement(By.id(NormalSpeed)).clear();
	driver.findElement(By.id(NormalSpeed)).sendKeys(RandomStringUtils.randomNumeric(2));
	driver.findElement(By.id(MinimumSpeed)).clear();
	driver.findElement(By.id(MinimumSpeed)).sendKeys(RandomStringUtils.randomNumeric(2));
	driver.findElement(By.id(MinimumFuelLevel)).clear();
	driver.findElement(By.id(MinimumFuelLevel)).sendKeys(RandomStringUtils.randomNumeric(2));
	driver.findElement(By.id(SuddenFuelChange)).clear();
	driver.findElement(By.id(SuddenFuelChange)).sendKeys(RandomStringUtils.randomNumeric(2));
}

private void toPersonnelSettingTab() {
	driver.findElement(By.xpath(PersonnelSettings)).click();
  	driver.findElement(By.id(MobileDeviceMinimumBatteryLevel)).clear();
  	driver.findElement(By.id(MobileDeviceMinimumBatteryLevel)).sendKeys(RandomStringUtils.randomNumeric(2));
  	driver.findElement(By.id(MaxIdleTime)).clear();
  	driver.findElement(By.id(MaxIdleTime)).sendKeys(RandomStringUtils.randomNumeric(3));
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