package com.Testng;
import org.testng.annotations.Test;

public class case1Test {

	@Test
	public void m1() {

		System.out.println("test");
	}
	
	
	
	@Test(invocationCount=2)
	public void m12() {

		System.out.println("test 11");
	}
	
	@Test()
	public void m13() {

		System.out.println("test");
	}
	
	
	
	/*
	@Test(groups = "login")
	public void method1() {
		System.out.println("login");
		assertTrue(false);
	}
	
	@Test(dependsOnGroups="login",alwaysRun=true)
	public void dependMethod() {
		System.out.println(" depend login");
	}

	
	@Test(dependsOnMethods = { "testTwo" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() {
        System.out.println("Test method two");
        assertTrue(false);
    }
    
    
    @Test(enabled=true)
    public void testTwoww() {
        System.out.println("Test method two");
        assertTrue(false);
    }
    
    
	
	*/
	
}
