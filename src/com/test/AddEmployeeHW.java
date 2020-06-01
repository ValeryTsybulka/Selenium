package com.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class AddEmployeeHW extends CommonMethods{
	
  @Test
  public void eddEmp() {
	  
	  login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	  dashboard.navigateToAddEmployee();
	  addEmp.addEmp("Sergey", "Tsybulka", "7654051771");
	  String acctualText=addEmp.required.getText();
	  System.out.println("acctualTex---------------------------->"+acctualText);
	  String expectedText="Required";
	  SoftAssert soft=new SoftAssert();
	  soft.assertTrue(acctualText.equals(expectedText), "Acctual text is not match");
	  wait(3);
	  sendText(addEmp.photo, ConfigsReader.getProperty("photo"));
	  
	 // Assert.assertEquals(acctualText, expectedText, "Acctual text is not match");
	
  }
}
