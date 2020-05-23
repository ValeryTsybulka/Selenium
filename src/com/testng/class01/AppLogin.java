package com.testng.class01;
import javax.swing.text.StyledEditorKit.BoldAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;
public class AppLogin extends CommonMethods {
	
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	@Test
	public void test() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		WebElement lgnButton = driver.findElement(By.id("btnLogin"));
		click(lgnButton);
		WebElement logo = driver.findElement(By.xpath("//div[@id='wrapper']//img"));
		boolean displayed = logo.isDisplayed();
		if (displayed) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is NOT displayed");
		}

	}

}
