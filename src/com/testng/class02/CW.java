package com.testng.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class CW extends CommonMethods {
	@BeforeMethod
	public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void Method() {
		WebElement username = driver.findElement(By.id("user-name"));
		sendText(username, "standart_user");
		
		WebElement password = driver.findElement(By.id("password"));
		sendText(password, "secret_sauce");
		
		WebElement lgnButton = driver.findElement(By.xpath("//input[@type='submit']"));
		lgnButton.click();
	}

	@AfterMethod
	public void AfterMethod() {
		tearDown();
	}

}
