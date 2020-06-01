package com.testng.review01;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class SauseDemoLogin extends CommonMethods {
	
	@Test(dataProvider = "dataProvider", groups = "smoke")
	public void login(String userName, String passwd) {

		ss.loginToSauceDemo(userName, passwd);

		wait(3);
		// take screeshot
		// takeScreenshot(userName + "_" + passwd);

		if (userName.equals("locked_out_user")) {
			Assert.assertTrue(ss.logo.isDisplayed());// need errmessage
		} else {
			Assert.assertTrue(ss.logo.isDisplayed());
		}

	}

	@DataProvider(name = "dataProvider")
	public Object[][] getData() {
		Object[][] data = { { "standard_user", "secret_sauce" }, 
				            {"locked_out_user", "secret_sauce"},
				            {"performance_glitch_user", "secret_sauce"}, 
				            { "problem_user", "secret_sauce" }
				            };
		return data;
	}

}
