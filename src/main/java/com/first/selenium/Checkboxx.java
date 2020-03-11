package com.first.selenium;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxx {
	public static void main(String[] args) throws InterruptedException {
		
	
	//System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver exe File\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	driver.manage().window().maximize();
	List<WebElement> checklist=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checklist.size());
	for(WebElement e: checklist)
	{
		System.out.println(e.getText());
	
	e.click();
	break;
	

	}
	
	WebElement ele1 = driver.findElement(By.xpath("//input[@class=\"cb1-element\"]"));
	System.out.println(ele1.isSelected());
	
	if(!ele1.isSelected())
	{
		ele1.click();
		Thread.sleep(2000);
	}
	driver.close();
}
}
