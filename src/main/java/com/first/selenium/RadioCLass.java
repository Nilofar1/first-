package com.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCLass {
	
	

	//public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver exe File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver = AppConstantFields.InitializeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println(checkbox.size());
	for(WebElement e : checkbox)
	{
		System.out.println(e.getText());
		e.click();
		break;
	}
		
	/*	List<WebElement> radioList = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println(radioList.size());
		for(WebElement e : radioList)
		{
			System.out.println(e.getText());
			e.click();
			break;
		}*/
		
		
		WebElement ele1 = driver.findElement(By.id("vfb-6-0"));
		System.out.println(ele1.isSelected());
		
		if(!ele1.isSelected())
		{
			ele1.click();
		}
		
	}
	
}
