package selenium.deviceModule.qa;

public class SSMwebForm {

	protected String Usernamefield = "loginForm:usernameField";
	protected String Passwordfield = "loginForm:passwordField";
	protected String LoginBtn = "loginForm:j_idt12";
	protected String OthersSpan = "//div[@id='mainForm:navigation']/ul/li[3]/a/span[2]";
	protected String AssetsSpan = "//div[@id='mainForm:navigation']/ul/li[3]/ul/li[2]/a/span[2]";
	protected String Mobiledevicespan = "//div[@id='mainForm:navigation']/ul/li[3]/ul/li[2]/ul/li[6]/a/span";
	protected String CreateDevice = "mainForm:mobileDeviceTable:j_idt316";
	protected String IMEIField = "mainForm:tabView:imeiField";
	protected String MSDINfield = "mainForm:tabView:msisdnField";
	protected String Aliasfield = "mainForm:tabView:j_idt682";
	protected String DescriptionField = "mainForm:tabView:j_idt684";
	protected String NotificationTab = "Notification v1.3.3+";
	protected String LockScreen = "//div[@id='mainForm:tabView:j_idt720']/div[2]/span";
	protected String LowBattery = "//div[@id='mainForm:tabView:j_idt727']/div[2]/span";
	protected String MaxIdletime = "//div[@id='mainForm:tabView:j_idt734']/div[2]";
	protected String GeofenceArrival = "//div[@id='mainForm:tabView:j_idt741']/div[2]/span";
	protected String GeofenceDeparture = "//div[@id='mainForm:tabView:j_idt748']/div[2]/span";
	protected String DeviceOnline = "//div[@id='mainForm:tabView:j_idt755']/div[2]/span";
	protected String SimChange = "//div[@id='mainForm:tabView:j_idt762']/div[2]/span";
	protected String Alarm = "//div[@id='mainForm:tabView:j_idt722']/div[2]";
	protected String ConfigurationTab = "Configuration v1.3.3+";
	protected String AuthorizephoneNum = "mainForm:tabView:numlst";
	protected String SMSNotification = "mainForm:tabView:fr";
	protected String EmailField = "mainForm:tabView:emailField";
	protected String SenderEmailField = "mainForm:tabView:senderEmailField";
	protected String EmailPasswordField = "mainForm:tabView:emailPasswordField";
	protected String FrontCam = "//div[@id='mainForm:tabView:j_idt797']/div[2]/span";
	protected String SaveBtn = "mainForm:deviceSaveButton";
	protected String CancelBtn = "mainForm:j_idt802";
	protected String EditBtn = "mainForm:mobileDeviceTable:0:j_idt315";
	protected String Message = "mainForm:j_idt72_container";
	protected String Logout = "mainForm:j_idt46";
	protected String EditBtn2 = "mainForm:mobileDeviceTable:1:j_idt315";
	protected String DeactivateBtn  = "mainForm:j_idt801";
	protected String ConfirmBtn  = "mainForm:j_idt806";
	protected String ShownInactive = "//div[@id='mainForm:mobileDeviceTable:j_idt295']/div[2]/span";
	protected String Active = "mainForm:j_idt801";
	protected String Search = "mainForm:mobileDeviceTable:globalFilter";
	
	// Search Device 
	
	protected String SearchByIMEI = ".//*[@id='mainForm:mobileDeviceTable_data']/tr[2]/td[1]";
	protected String SearchByALias = ".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[2]";
	protected String SearchByPhoneNumber = ".//*[@id='mainForm:mobileDeviceTable_data']/tr[1]/td[3]";
	
    // Global Configuration
	
	protected String Settingsspan = ".//*[@id='mainForm:navigation']/ul/li[3]/ul/li[3]/a/span[2]";
	protected String PhoneSetting = ".//*[@id='mainForm:j_idt130']/ul/li[1]/a";
	protected String AuthorizedPhoneNumberList = "mainForm:j_idt130:numlst";
	protected String PhoneNumbertonotify = "mainForm:j_idt130:numNotiflst";
	protected String ReceivingEmail = "mainForm:j_idt130:emailField";
	protected String SendingEmail = "mainForm:j_idt130:senderEmailField";
	protected String SendingEmailPwd = "mainForm:j_idt130:j_idt155";
	protected String CameraCaptureKey = "mainForm:j_idt130:cameraCaptureKey";
	protected String RebootKeyword = "mainForm:j_idt130:rebootKey";
	protected String PhoneStatKey = "mainForm:j_idt130:phoneStatKey";
	protected String ConfigSyncKey = "mainForm:j_idt130:configSync";
	protected String VehicleSettingsTab = ".//*[@id='mainForm:j_idt130']/ul/li[2]/a";
	protected String MaximumSpeed = "mainForm:j_idt130:j_idt203";
	protected String NormalSpeed = "mainForm:j_idt130:j_idt209";
	protected String MinimumSpeed = "mainForm:j_idt130:j_idt216";
	protected String MinimumFuelLevel = "mainForm:j_idt130:j_idt221";
	protected String SuddenFuelChange = "mainForm:j_idt130:j_idt226";
	protected String PersonnelSettings = ".//*[@id='mainForm:j_idt130']/ul/li[3]/a";
	protected String MobileDeviceMinimumBatteryLevel = "mainForm:j_idt130:j_idt238";
	protected String MaxIdleTime = "mainForm:j_idt130:j_idt243";
	protected String SaveConfogBtn = "mainForm:configSaveButton";
	
	public SSMwebForm() {
		super();
	}

}