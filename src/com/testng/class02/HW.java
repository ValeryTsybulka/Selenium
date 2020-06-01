package com.testng.class02;

import org.testng.annotations.Test;

import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;
import com.utils.Constants;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class HW extends CommonMethods {
	@BeforeMethod
	public void openBrowserAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

	@Test
	public void validLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		// 1st way
		// username.sendKeys(ConfigsReader.getProperty("username"));
		// 2nd way
		// sendText(username,ConfigsReader.getProperty("username"));

		// 3rd way, the best way
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));

		// 1st way
//		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
//		wait.until(ExpectedConditions.elementToBeClickable(login.loginBtn));
//		login.loginBtn.click();
//		
		// 2nd way
//		waitForClickability(login.loginBtn);
//		login.loginBtn.click();

		// 3rd way
		click(login.loginBtn);
		DashboardPageElements dashboard = new DashboardPageElements();

		boolean displayed = dashboard.logo.isDisplayed();

		if (displayed) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}
		
		
	}
}
