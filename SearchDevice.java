package selenium.deviceModule.qa;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchDevice extends SSMwebForm {
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
	public void Search_DeviceIMEI() throws Exception {
		driver.get(baseUrl + "/satellite/login.jsf");
		toLogin();
		toMobileDeviceSpan();
		String sCellValue = driver.findElement(By.xpath(SearchByIMEI)).getText();
		driver.findElement(By.id(Search)).sendKeys(sCellValue);
		Thread.sleep(9000);
}

@Test
public void Search_DeviceAlias() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	toLogin();
	toMobileDeviceSpan();
	String sCellValue = driver.findElement(By.xpath(SearchByALias)).getText();
	driver.findElement(By.id(Search)).sendKeys(sCellValue);
	Thread.sleep(9000);
}

@Test
public void Search_PhoneNumber() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	toLogin();
	toMobileDeviceSpan();
	String sCellValue = driver.findElement(By.xpath(SearchByPhoneNumber)).getText();
	driver.findElement(By.id(Search)).sendKeys(sCellValue);
	Thread.sleep(9000);
}

@Test
public void Search_NoMatchFound() throws Exception {
	driver.get(baseUrl + "/satellite/login.jsf");
	toLogin();
	toMobileDeviceSpan();
	driver.findElement(By.id(Search)).sendKeys(RandomStringUtils.randomAlphanumeric(6));
	Thread.sleep(9000);
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

@After
	public void tearDown() throws Exception {
		//driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
			}
	}
	private void fail(String verificationErrorString) {
	}
}