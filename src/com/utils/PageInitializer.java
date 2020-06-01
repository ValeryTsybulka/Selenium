package com.utils;

import com.pages.AddEmployeePageElements;
import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.pages.PersonalDetailsPageElements;
import com.testng.review.sauceDemoLoginPage;

public class PageInitializer extends BaseClass {

	//initiolize all pages class and stores references in static variables
	//that will be called/used in test classes
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static sauceDemoLoginPage ss;

	public static void initialize() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		ss = new sauceDemoLoginPage();
	}
}
