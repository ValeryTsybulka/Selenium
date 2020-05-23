package com.testng.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class NegativeLogin extends CommonMethods {
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	 @AfterMethod
	public void closeBrowser() {
		tearDown();
	}

	@Test
	public void negativeLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement lgnButton = driver.findElement(By.id("btnLogin"));
		click(lgnButton);
		WebElement message = driver.findElement(By.id("spanMessage"));
		boolean displayed = message.isDisplayed();
		if (displayed) {
			System.out.println("Message is displayed");
		} else {
			System.out.println("Message is NOT displayed");
		}

	}

}
