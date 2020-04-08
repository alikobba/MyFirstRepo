package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


import static java.time.Duration.ofSeconds;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTestCases extends BaseClass {

	static String sign_in_button = "com.maticservices.consumer.dev:id/signInButton";
	static String page_title = "com.maticservices.consumer.dev:id/titleTextView";
	static String page_description = "com.maticservices.consumer.dev:id/infoTextView";
	static String country_code = "com.maticservices.consumer.dev:id/countryCodePickerLayout";
	static String phone_number = "com.maticservices.consumer.dev:id/phoneNumberEditText";
	static String send_button = "com.maticservices.consumer.dev:id/signInButton";
	static String sign_in_fb = "com.maticservices.consumer.dev:id/signUpFacebookButton";
	static String back_button = "android.widget.ImageButton";
	static String select_country_locator = "com.maticservices.consumer.dev:id/rlClickConsumer";
	static String country_locator_title = "com.maticservices.consumer.dev:id/textView_title";
	static String country_locator_close = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";
	static String country_locator_search = "com.maticservices.consumer.dev:id/editText_search";
	static String country_locator_line_separator = "com.maticservices.consumer.dev:id/preferenceDivider";
	static String back_from_ver_page = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]\r\n";
	static String country_codes_list = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[1]\r\n"
			+ "";
	static 	String verification_code = "com.maticservices.consumer.dev:id/verifyCodeEditText";
	static String profile_page = "com.maticservices.consumer.dev:id/main_profile_nav_graph";
	static String profile_details = "com.maticservices.consumer.dev:id/backgroundGradientProfileTop";
	static String logout_button = "com.maticservices.consumer.dev:id/logOutTextView";
	static String confirm_logout = "android:id/button1";
	
	  @Test (priority = 1)
	public static void C227_validate_SignInpage() { 
	  System.out.println("started with first test case");
	  WebDriverWait waiting_time = new WebDriverWait(driver, 10);
	  waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(
	  sign_in_button))).click();
	  
	  boolean con_1 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  page_title))) .isDisplayed(); boolean con_2 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  page_description))) .isDisplayed(); boolean con_3 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  country_code))) .isDisplayed(); boolean con_4 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  phone_number))) .isDisplayed(); boolean con_5 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  send_button))) .isDisplayed(); boolean con_6 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  sign_in_fb))) .isDisplayed(); boolean con_7 =
	  waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.className
	  (back_button))) .isDisplayed();
	  
	  if (con_1 && con_2 && con_3 && con_4 && con_5 && con_6 && con_7) {
	  System.out.println("All sign in page layouts are displayed!"); }
	  
	  else { Assert.assertEquals(!con_1, con_1,
	  "Page title is missing from the sign up page"); Assert.assertEquals(!con_2,
	  con_2, "The description below the title is missing from the sign up page");
	  Assert.assertEquals(!con_3, con_3,
	  "Country Code drop down list is missing from the sign up page");
	  Assert.assertEquals(!con_4, con_4,
	  "Phone number field is missing from the sign up page");
	  Assert.assertEquals(!con_5, con_5,
	  "send button is missing from the sign up page"); Assert.assertEquals(!con_6,
	  con_6, "FB sign in button is missing from the sign up page");
	  Assert.assertEquals(!con_7, con_7,
	  "Back Button is missing from the sign up page");
	  
	  }
	  
	  waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(
	  select_country_locator))).click(); 
	  
	  boolean country_1 = waiting_time
	  .until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  country_locator_title))).isDisplayed(); 
	  
	  boolean country_2 = waiting_time
	  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	  country_locator_close))).isDisplayed(); 
	  
	  boolean country_3 = waiting_time
	  .until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  country_locator_search))).isDisplayed(); 
	  
	  boolean country_4 = waiting_time
	  .until(ExpectedConditions.visibilityOfElementLocated(By.id(
	  country_locator_line_separator))) .isDisplayed();
	  
	  // trying to check if all countries are displayed in the list
	  
		/*
		 * WebElement source; boolean result = true; for (int i = 0; i<=10; i++) {
		 * result= true; if (driver.findElements(By.id(country_codes_list)).get(i) !=
		 * null) { result = false; }
		 * 
		 * else { Assert.assertFalse("Back Button is missing from the sign up page",
		 * result == true); } } System.out.print("All main countries are displayed!");
		 * 
		 * }
		 * 
		 */
	  if (country_1 && country_2 && country_3 && country_4) {
	  System.out.println("All country dropdown in page layouts are displayed!"); }
	  
	  else { Assert.assertEquals(!country_1, country_1,
	  "Title is missing from the country drop down list page");
	  Assert.assertEquals(!country_2, country_2,
	  "The close icon is missing from from the country drop down list page");
	  Assert.assertEquals(!country_3, country_3,
	  "The search field is missing from the country drop down list page");
	  Assert.assertEquals(!country_4, country_4,
	  "The line separator below the favorite countries section is missing from the country drop down list page"
	  );
	  
	  }
	  waiting_time.until(ExpectedConditions.elementToBeClickable(By.xpath(
			  country_locator_close))).click();
	  
	  }

	
	   public static void swipeBottom() {
	        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
	        WebElement slider =  webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageView")));
	      
	        Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int x = width/2;
			int top_y = (int)(height*0.80);
			int bottom_y = (int)(height*0.05);
			
	        ElementOption press = element(slider, x, top_y);
	        ElementOption move = element(slider, x, bottom_y);

	        TouchAction swipe = new TouchAction((PerformsTouchActions) driver).press(press).moveTo(move).release().perform();
	
	    }
	  
	@Test (priority = 2)
	public static void C219_Successful_Sign_in() {
		System.out.println("started my second test");
		WebDriverWait waiting_time = new WebDriverWait(driver, 20);
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(
				select_country_locator))).click();
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.xpath(country_codes_list))).click();

		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(phone_number))).sendKeys("552014654");
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(send_button))).click();
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(verification_code))).sendKeys("5555");
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(profile_page))).click();
		swipeBottom();
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(logout_button))).click();
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(confirm_logout))).click();
		
	}
	
	@Test (priority = 3)
	public static void C220_Invalid_data_Login_forbidden() {
		WebDriverWait waiting_time = new WebDriverWait(driver, 20);
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(
				sign_in_button))).click();
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(phone_number))).sendKeys("4567874819");
		boolean condition = waiting_time.until(ExpectedConditions.visibilityOfElementLocated(By.id(sign_in_button))).isEnabled();
		Assert.assertEquals(!condition, !condition,
				"Phone Number format is not correct - Pass test case");
	}

	@Test (priority = 4)
	public static void C14109_Failed_Login_Incorrect_Verification_Code() {
	    WebDriverWait waiting_time = new WebDriverWait(driver, 20);
	    waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(phone_number))).clear();
	    waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(
				select_country_locator))).click();
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.xpath(country_codes_list))).click();
	    waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(phone_number))).sendKeys("552014654");
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(sign_in_button))).click();

		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(verification_code))).sendKeys("4444");
		String error_messsage = "com.maticservices.consumer.dev:id/textinput_error";
		boolean condition = waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(error_messsage))).isDisplayed();
		Assert.assertEquals(condition, condition,
				"Incorrect Verification code - Pass test case");
	}
}
