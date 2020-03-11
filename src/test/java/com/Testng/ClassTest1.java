package com.Testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ClassTest1 {
	
  @Test(invocationCount=5)
	public void testcase5()
	{
   System.out.println("testcase5");
}
  /*@Test(groups= "user")
  public void aaestcase6()
	{
 System.out.println("testcase6");
 assertTrue(false);
 
  }
    @Test(dependsOnGroups="user", alwaysRun= true)
  public void testcase7()
	{
 System.out.println("testcase7");*/
	//}
/*@Test(invocationCount=2)
public void testcase9()
{
System.out.println("testcase9");
}*/
/*@Test(enabled=false)
public void testcase88()
{
System.out.println("testcase88");
assertTrue(true);
}*/
 
}
