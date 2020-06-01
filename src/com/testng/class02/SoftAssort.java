package com.testng.class02;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SoftAssort extends CommonMethods{

  @BeforeMethod
  public void login() {
	  setUp();
  }

  @AfterMethod
  public void quit() {
	  tearDown();
  }
  @Test
  public void f() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements loginDashboard=new DashboardPageElements();
		
		boolean logoDisplayed = login.logo.isDisplayed();
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(logoDisplayed, "Logo is not displayed");
		
		System.out.println("After first assertion");
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(5);
		
		boolean dashDisplayed=loginDashboard.welcome.isDisplayed();
		soft.assertTrue(dashDisplayed);
		
		//this will check if all soft assertions passed or failed
		soft.assertAll();
  }
}
