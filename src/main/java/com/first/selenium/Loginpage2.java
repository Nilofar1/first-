package com.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage2 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "E:\\FirefoxDriver exe file\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement uemail = driver.findElement(By.id("email"));
		uemail.clear();
		uemail.sendKeys("nilo@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.clear();
		pass.sendKeys("nilo123");
		// System.out.println(pass.getTagName());
		// System.out.println(pass.getAttribute("type"));

		// System.out.println(pass.getSize().getWidth());
		WebElement signinBtn = driver.findElement(By.id("SubmitLogin"));
		// loginBtn.submit();

		signinBtn.click();

		/*
		 * 
		 * 
		 * String title =driver.getTitle(); System.out.println(title);
		 * System.out.println(driver.getPageSource());
		 * 
		 * System.out.println(driver.getWindowHandle());
		 * 
		 * String parnet = driver.getWindowHandle();
		 * 
		 * driver.navigate().to("https://www.yatra.com/trains");
		 * 
		 * Set<String>allWindow = driver.getWindowHandles();
		 * System.out.println(allWindow);
		 * 
		 * 
		 * 
		 * 
		 * driver.navigate().back();
		 * 
		 * 
		 * 
		 * //driver.quit();
		 */

		Thread.sleep(000);
		driver.close();
	}

}