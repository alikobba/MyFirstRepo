package tests;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertFalse;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertFalse;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass {

	@Factory
	public Object[] getTestClasses() {
		Object[] tests = new Object[1];
		tests[0] = new SignInTestCases();
		return tests;
	}

//	public static void main(String[] args) {
//		
//		SignInTestCases SignIn = new SignInTestCases();
//		
//		try {
//			setup();
//			//Change_Language();
//			//cancel_Change_Language();
//			//privacy_policy_view();
//			//terms_view();
//			SignIn.C227_validate_SignInpage();
//			teardown();
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}

}
