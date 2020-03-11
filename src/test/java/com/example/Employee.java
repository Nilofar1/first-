package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Employee {
	/*@Parameters({"url"})
	 @Test
	public void employeename(String url)
	{
		System.out.println("name of employee");
		System.out.println("url : "+url);
	}*/
	
	
	 @Test
		public void noofemployee()
		{
			System.out.println("no.of employee");
		}
	 @Test
		public void employeeadd()
		{
			System.out.println("add of employee");
		}
	 @Test
		public void employeecity()
		{
			System.out.println("city of employee");
		}
}
