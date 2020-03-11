package com.first.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();*/
		
		
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver exe File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		//driver.findElement(By.tagName("a"));  //All Link
		//driver.findElement(By.xpath("//div[@class=\"menu\"]//a[@href=\"#\" and @id=\"menu_admin_UserManagement\"]"));
		
	/*	
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("admin");*/
		
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.clear();
		pass.sendKeys("admin123");
		System.out.println(pass.getTagName());
		System.out.println(pass.getAttribute("type"));
		
		System.out.println(pass.getSize().getWidth());
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
	//	loginBtn.submit();
		
	//	loginBtn.click();
		
		
		
		
		/*String title =driver.getTitle();
		System.out.println(title);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		String parnet = driver.getWindowHandle();
		
		driver.navigate().to("https://www.yatra.com/trains");
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		
		
		
		driver.navigate().back();*/
		
		
		
		//driver.quit();
	
		
		Thread.sleep(8000);
		driver.close();
	}

}
