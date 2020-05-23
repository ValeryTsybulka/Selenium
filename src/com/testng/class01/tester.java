package com.testng.class01;

import org.testng.annotations.Test;

public class tester {
	
	@Test// it's one Test Case
public void TestOne() {
	System.out.println("Executing Case1");
	System.out.println("Executing Case2");
	System.out.println("Executing Case3");
}
	@Test//second Tast case
	public void TestTwo() {
		System.out.println("Executing Test2");
	}
	@Test//3 test case
	public void TestThree() {
		System.out.println("Executing Test3");
	}
}
