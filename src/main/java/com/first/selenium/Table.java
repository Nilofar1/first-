package com.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
	
	public static WebDriver driver =null;
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\FirefoxDriver exe file\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver = AppConstantFields.InitializeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		/*
		List<WebElement> list = driver.findElements(By.xpath("//div[@id=\"content\"]/table/thead/tr/th"));
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}*/
		
		 WebElement ele= driver.findElement(By.id(""));
		System.out.println(body.size());
		for(WebElement e: body)
		{
			System.out.println(e.getText());
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
