package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	@Test(dataProvider="wordpress")
	public void datapresslogin(String username,String password) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver exe File\\80");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("//input[@id=\"txtUsername\"]")).sendKeys("username");
		
		driver.findElement(By.id("//input[@id=\"txtPassword\"]")).sendKeys("password");
		
		driver.findElement(By.id("//input[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
	
	}
	
	
	@DataProvider(name="wordpress")
	public Object[][] database()
	{
		Object[][] data= new Object[3][2];
		
		data [0][0] ="admin";
		
		data[0][1] = "user";
		
		data[1][0] = "admin1";
		
	    data[1][1] = "user1";
	    
	    data[2][0] ="admin2";
	    
	    data[2][1] ="user2";
	    
	   
	    
		return data;
		
		
	}

}
