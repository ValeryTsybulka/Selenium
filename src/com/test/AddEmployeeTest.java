package com.test;
import org.testng.annotations.Test;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void addEmployeePage() {

		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		wait(2);
		dashboard.navigateToAddEmployee();
		wait(5);
		addEmp.addEmp("Petr", "Petrov", "818181");	
		wait(5);

//		sendText(addEmp.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(addEmp.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(addEmp.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(addEmp.saveEmp);

		// add assertion to verify that employee has been added successfully

	}

}
