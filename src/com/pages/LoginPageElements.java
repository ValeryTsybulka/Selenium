package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.BaseClass;

public class LoginPageElements {
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;

	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']//img")
	public WebElement logo;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;

	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
