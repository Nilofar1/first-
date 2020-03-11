package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] data = new  Object[2][2];
		data[0][0] = "Test1";
		data[0][1] = "Test2";
		
		data[1][0] = "Test3";
		data[1][1] = "Test4";
		return data;
		
	}
	
	@DataProvider
	public Object[][] dataP1()
	{
		
		Object[][] data1 = new Object[2][2];
		data1[0][0] = "usar";
		data1[0][1] = "pass";
		
		data1[1][0] = "usar1";
		data1[1][1] = "pass1";
		
		return data1;
		
	}
	
	@Test(dataProvider="dataP1")
	public void test1(String str1 ,String str2)
	{
		System.out.println(str1 +str2);
	}
	
	
	
	@Test(dataProvider="testData")
	public void m1(String s1 , String s2)
	{
		System.out.println("s1 :"+s1 +" s2 :" +s2);
	}

}
