package com.testng.class02;
import org.testng.annotations.Test;

import com.pages.DashBoardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class Task extends CommonMethods {

	@BeforeMethod
	public void beforeMethod() {
		setUp();
	}

	//@AfterMethod
	public void afterMethod() {
		tearDown();
	}

	@Test
	public void verifyLogo() {
		LoginPageElements login = new LoginPageElements();
		DashBoardPageElements loginDashboard=new DashBoardPageElements();
		
		boolean logoDisplayed = login.logo.isDisplayed();
		Assert.assertTrue(logoDisplayed, "Logo is not displayed");
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(5);
			boolean dashDisplayed=loginDashboard.welcome.isDisplayed();
			Assert.assertTrue(dashDisplayed);
			
		String dashbordLogin= loginDashboard.welcome.getText();
		String expectedText="Welcome Admin";
		Assert.assertEquals(expectedText, dashbordLogin, "User is not logged");
}		
	
}
