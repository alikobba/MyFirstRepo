package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LandingPageTestCases extends BaseClass{
	static WebDriverWait waiting_time = new WebDriverWait(driver, 10);

	
	
	//	@Test
	public static void Change_Language(){
		
		String language_button = "com.maticservices.consumer.dev:id/languageButton";
		String confirm_change_language = "android:id/button1";
		
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(language_button))).click();
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(confirm_change_language))).click();
			}
//	@Test
	public static void cancel_Change_Language(){
		WebDriverWait waiting_time = new WebDriverWait(driver, 10);
		String language_button = "com.maticservices.consumer.dev:id/languageButton";
		String confirm_change_language = "android:id/button2";
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(language_button))).click();
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(confirm_change_language))).click();
			}
//	@Test
	public static void terms_view(){
		WebDriverWait waiting_time = new WebDriverWait(driver, 20);
		String terms_link = "com.maticservices.consumer.dev:id/termsButton";
		String backToLanding = "android.widget.ImageButton";
		String page_loaded = "android.view.View";
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(terms_link))).click();
		if(waiting_time.until(ExpectedConditions.elementToBeClickable(By.className(page_loaded))).isDisplayed()) {
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.className(backToLanding))).click();
		}
			}
//	@Test
	public static void privacy_policy_view(){
		WebDriverWait waiting_time = new WebDriverWait(driver, 20);
		String privacy_link = "com.maticservices.consumer.dev:id/policyButton";
		String backToLanding = "android.widget.ImageButton";
		String page_loaded = "android.view.View";
		
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.id(privacy_link))).click();
		if(waiting_time.until(ExpectedConditions.elementToBeClickable(By.className(page_loaded))).isDisplayed()) {
		waiting_time.until(ExpectedConditions.elementToBeClickable(By.className(backToLanding))).click();
		}
			}
	
}
