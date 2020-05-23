package com.testng.class02;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPageElements;

import com.utils.CommonMethods;

public class AssortionDemo extends CommonMethods{
	// This is also called Hard Assert

		@BeforeMethod
		public void openBrowserAndNavigate() {
			setUp();
		}

		@AfterMethod
		public void quitBrowser() {
			tearDown();
		}

		// AssertionError is handled within TestNG
		// Even if one Test Case fails, the others will executed

		@Test
		public void titleValidation() {
			String expectedTitle = "Human Management System";
			String actualTitle = driver.getTitle();

			// 1st way
			// Assert.assertEquals(actualTitle, expectedTitle);

			// 2nd way, You are giving a msg
			Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");

			// if the (hard) assertion fails
			// the statements after assertion will not be executed.
			System.out.println("Text after assertion");
		}

		@Test(priority = 2, dependsOnMethods = { "titleValidation" })
		public void logoValidation() {
			LoginPageElements login = new LoginPageElements();
			boolean logoDisplayed = login.logo.isDisplayed();

			// 1st way
			// Assert.assertEquals(logoDisplayed, true, "Logo is not displayed");

			// 2nd way
			Assert.assertTrue(logoDisplayed, "Logo is not displayed");
		}
		// Depending method will throw an exception
		// @Test(priority = 3, enabled = false)

		// Case 3: if this test method fails, it will run but fail
		// Depending method will not execute

		// Case 4: if this test method passes, it will run and pass
		// Depending method will execute

		@Test(priority = 3)
		public void invalidLogin() throws Exception {
			LoginPageElements login = new LoginPageElements();

}}