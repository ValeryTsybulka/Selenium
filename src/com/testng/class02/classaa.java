package com.testng.class02;

import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class classaa extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(2);
		DashboardPageElements dashLogin = new DashboardPageElements();

		boolean bool = dashLogin.welcome.isEnabled();
		System.out.println(bool);
		String dashText = dashLogin.welcome.getText();
		System.out.println(dashText);
	}

}
