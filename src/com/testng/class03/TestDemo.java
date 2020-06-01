package com.testng.class03;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDemo {

	@BeforeClass(alwaysRun = true)// this method will always execute
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterClass(alwaysRun = true)// to make this method to run after each test
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@Test(dependsOnGroups = {"smoke"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Test2");
		//Assert.assertTrue(false);// if this test fails, test1 will be skipped
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(false);
	}

	@Test(groups = { "regression" })
	public void test3() {
		System.out.println("Test3");
	}

	@Test(groups = { "smoke", "regression" })
	public void test4() {
		System.out.println("Test4");
	}

}
