package com.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver exe File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> list = driver.findElements(By.xpath("//div[@id=\"content\"]/table/thead/tr/th"));
	
	for(WebElement e:list)
	{
		System.out.println(e.getText());
	}

       driver.close();
		
		
	}		
}
