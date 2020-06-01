package com.testng.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

@Test(dataProvider = "getData")
public class DataProviderDemo extends CommonMethods{
	
	public void login1(String username, String password, int age) {
		System.out.println(age);
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);
		
		boolean isDisplayed=dashboard.welcome.isDisplayed();
		Assert.assertTrue(isDisplayed, "Welcome msg is not displayed");
	}
	
	@DataProvider
	public Object[] [] getData(){
		
		// the number of rows will decide how many times the test will run
		// the colums of each row are bound/pass as parameter to Test Case
		Object[][] data= {
				{"Admin", "Hum@nhrm123", 22},
				{"SyntaxUser", "Syntax123", 33},
				{"Syntax1", "Syntax123", 44}
		};
		//2nd way
		Object[][] data2=new Object[3][3];
		data2[0][0]="Admin";
		data2[0][1]="Hum@nhrm123";
		data2[0][2]="22";
		
		data2[1][0]="SyntaxUser";
		data2[1][1]="Syntax123";
		data2[1][2]="33";
		
		data2[2][0]="Syntax1";
		data2[2][1]="Syntax123";
		data2[2][2]="44";
		return data;
	}
}
