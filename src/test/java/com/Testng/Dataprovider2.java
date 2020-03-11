package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
	
	@DataProvider
	public Object[][] dataMethod()
	{

		Object[][] data1 = new Object[2][2];
		data1[0][0] = 1;
		data1[0][1] = "pass";
		
		data1[1][0] = 10;
		data1[1][1] = "pass1";
		
		return data1;
	}
	
	
	@Test(dataProvider="dataMethod")
	public void method(int i,String s)
	{ 
		System.out.println(i+s);
	
	}

}
