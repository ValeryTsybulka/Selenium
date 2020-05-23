package com.testng.class02;

import org.testng.annotations.Test;

import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import org.testng.annotations.BeforeMethod;

import java.awt.peer.LightweightPeer;

import org.testng.annotations.AfterMethod;

public class HW2 extends CommonMethods {

	

	@BeforeMethod
	public void openBrowserAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void invalidLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		click(login.loginBtn);

		String expectedText = "Password cannot be empty";
		String actualText = login.errorMsg.getText();
		boolean erroeDisplayed = login.errorMsg.isDisplayed();
		if (erroeDisplayed) {
			System.out.println("Error is displayed");
			
			if (expectedText.equals(actualText)) {
				System.out.println("Error message is correct");
			}else {
			System.out.println("Error message is NOT correct");
			}
		}else {
			System.out.println("Error is NOT displayed");
		}
	}
}