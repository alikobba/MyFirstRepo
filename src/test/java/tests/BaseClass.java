package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	// static AppiumDriver<MobileElement> driver;
	AndroidDriver<MobileElement> driver_and;
	
	// IOSDriver<MobileElement> driver_iOS;
	static WebDriver driver;

	@BeforeClass
	public static void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(CapabilityType.VERSION, "8.0.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S7 edge");
		caps.setCapability(MobileCapabilityType.UDID, "ce011711b3c3006e0c");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		caps.setCapability("appPackage", "com.maticservices.consumer.dev");
		caps.setCapability("appActivity", "com.maticservices.consumer.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		// driver = new AppiumDriver<MobileElement>(url, caps);
		driver = new AndroidDriver<MobileElement>(url, caps);
		System.out.println("Application Started.....");

	}

	@AfterClass
	public static void teardown() {
		// close the app
		driver.quit();
	}

}
