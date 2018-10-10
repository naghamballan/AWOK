import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import helper.Locators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class testpurpose {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		//create a file to get the apk
		File appdir=new File("src");

	//getting apk from src
		File app =new File(appdir,"100918.apk");

	//creating desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
	
	//setting all the desired capabilities
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "45000");
		//cap.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.awok.store.*");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath()); //getting app path 
		cap.setCapability("autoDismissAlerts", true); // dismiss system alert
	
	//defining android driver
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Reporter.log("App installed successfully",true);
		
		driver.findElementById("com.awok.store:id/skip").click();
		Thread.sleep(3000);
		driver.findElementById("com.awok.store:id/locale_done_button").click();
		Thread.sleep(3000);
		driver.findElementByClassName("android.widget.ImageButton").click();
		Thread.sleep(2000);
		
		
	}

}
