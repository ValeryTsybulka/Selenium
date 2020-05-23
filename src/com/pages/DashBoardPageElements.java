package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.BaseClass;
public class DashBoardPageElements {
	@FindBy(id="welcome")
	public WebElement welcome;

	@FindBy(xpath ="//div[@id='branding']//img")
	public WebElement logo;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
