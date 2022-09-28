package practice;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunTime {
//	public static void main(String[] args) {
//	      try {
//
//	         // print a message
//	         System.out.println("Executing notepad.exe");
//
//	         // create a process and execute notepad.exe
////	         Process process = Runtime.getRuntime().exec("notepad.exe");
//	         Process process = Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Experitest\\AppiumStudio\\AppiumStudio.exe\"");
//	         
//
//	         // print another message
//	         System.out.println("Notepad should now open");
//
//	      } catch (Exception ex) {
//	         ex.printStackTrace();
//	      }
//	}
//	
	@Test
	public void run() throws IOException, InterruptedException
	{
		 Process process = Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Experitest\\AppiumStudio\\AppiumStudio.exe\"");
		 System.out.println("Pass");
		 Thread.sleep(15000);
		 DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
			//caps.setCapability(MobileCapabilityType.UDID,"9TSGBIYLPN7HJJTC");
			caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,  "com.zee5.hipi");
			caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.zee5.hipi.presentation.splash.SplashActivity");
			//URL url = new URL("")
//			WebDriver appiumDriver = null;
//			WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
	
			
			System.out.println("Hipi App Launch");
			
	}
	
	
}
	
	
	
