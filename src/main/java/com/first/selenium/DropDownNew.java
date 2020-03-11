package com.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownNew {
	
public static WebDriver driver =null;
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver exe File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement ele = driver.findElement(By.id("select-demo"));
	
		Select sel = new Select(ele);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		/*
		Thread.sleep(2000);
		
		sel.selectByValue("Wednesday");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Sunday");*/
		
		
		System.out.println(sel.isMultiple());
		
		//sel.deselectAll();
		
		
		WebElement ele1 = sel.getFirstSelectedOption();
		System.out.println(ele1.getText());
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
