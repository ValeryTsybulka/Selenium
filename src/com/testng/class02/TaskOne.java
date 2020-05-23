package com.testng.class02;

import org.testng.annotations.Test;

public class TaskOne {
	// @Test(priority=2, dependsOnGroups = "firstMethod1")
  // @Test(priority=2)@Test(priority=2)
  public void firstMethod() {
System.out.println("firstMethod");
  }
  @Test(enabled=false)
  public void firstMethod1() {
System.out.println("firstMethod1");
  }
  @Test(priority=2)
  public void secondMethod() {
System.out.println("secondMethod");
  }
  @Test(priority=1)
  public void thirdMethod() {
System.out.println("thirdMethod");
  }
  @Test
  public void fourthMethod() {
System.out.println("fourthMethod");
  }
}
