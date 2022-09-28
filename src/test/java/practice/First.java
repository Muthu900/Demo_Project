package practice;

import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class First {
//	static AppiumDriver<MobileElement> driver;
	public TouchAction action;
	AppiumDriver<MobileElement> driver ;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
//	Runtime.getRuntime().exec("adb shell am start -n com.android.chrome/com.google.android.apps.chrome.Main");
	
//		try
//        {
//            // create a process and execute google-chrome
//            Process process = Runtime.getRuntime().exec("Google Chrome");
//            System.out.println("Google Chrome successfully started");
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//		getRuntime("adb shell am start -n com.android.chrome/com.google.android.apps.chrome.Main");
//		AndroidDriver<AndroidElement> driver =setupCapabilities();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		//caps.setCapability(MobileCapabilityType.UDID,"9TSGBIYLPN7HJJTC");
		//caps.setCapability(MobileCapabilityType.VERSION,"10");
		//caps.setCapability("devicename"+ "", "OPPOA5S");
		//caps.setCapability("UDID"+ "", "AUOVIFWCBE5SH6FI");
		//caps.setCapability("platform	name"+ "", "Android");
		//caps.setCapability("platform version"+ "", "8.1.0");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,  "com.android.chrome");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		//URL url = new URL("")
//		WebDriver appiumDriver = null;
//		WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
//		driver.get("https://www.amazon.com/");
		
//		Thread.sleep(25000);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
//		TouchAction action = new TouchAction(driver);
//		 new TouchAction(driver)
//		TouchAction b = action.tap(PointOption.point(282, 1332)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		
	
//		Thread.sleep(4000);
//		action.tap(PointOption.point(h));
//		action.tap (TapOptions.tapOptions ().withElement (ElementOption.element (driver.findElement(By.xpath("//*[@text='SHOP']"))))).waitAction (WaitOptions.waitOptions (Duration.ofMillis (4000))).perform();
//		driver.navigate().back();
//		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("(//*[@text='Open' and @onScreen='true'])[2]"))))).waitAction (WaitOptions.waitOptions(Duration.ofSeconds(20))).perform();
//		TouchActions action1 = new TouchActions(driver);
//		action1.singleTap(driver.findElement(By.xpath("//*[@text='SHOP']")));
//		action1.perform();


		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//*[@text='Open'])[2]")));
//		WebElement get=driver.findElement(By.xpath("(//*[@text='Open'])[2]"));
//		MobileElement shop = driver.findElement(By.xpath("//*[@text='Shop']"));
//		getDriver().findElement(By.xpath("//*[@text='Shop']")).click();
//		boolean ab=shop.isDisplayed();
//		if(ab) 
//		{
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
		
//		get.click();
//		System.out.println(get);
	
//		WebDriver appiumDriver = null;
//		WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//*[@text='Open'])[2]")));
	
	}
//	Process openProcess(final String[] cmdAttribs) throws IOException {
//		  return Runtime.getRuntime().exec(cmdAttribs);
//		}
//	private static Duration ofMillis(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
//	public static Process getRuntime(String cmdAttribs) throws IOException
//	{
//		 return Runtime.getRuntime().exec(cmdAttribs);
//	}
	
//public static AndroidDriver<AndroidElement> setupCapabilities() throws MalformedURLException {
//		
//		// 1 Create Device Capabilities.
//		DesiredCapabilities cap = new DesiredCapabilities();
//		
//		// 2 Setup a device name. This capability is currently ignored, but remains required on Android.		
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
//		
//		// 3 Setup a name of Android web browser to automate.
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//						
//		// 4 Create an Android driver to initiate the session to Appium server. 
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");					
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
//		
//		return driver;
//	}
//public static AppiumDriver<WebElement> getDriver() {
//	return getDriver();
//}
	
//	public void tapByElement (AndroidElement androidElement) {
//        new TouchAction(driver)
//            .tap(tapOptions().withElement(element(androidElement)))
//            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).perform();
//    }
//private ElementOption element(AndroidElement androidElement) {
//		// TODO Auto-generated method stub
//		return null;
	
	
//	}

//private Duration ofMillis(int i) {
//	// TODO Auto-generated method stub
//	return null;
//}
	

}
