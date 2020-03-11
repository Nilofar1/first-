package com.first.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotes {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\FirefoxDriver exe file\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = AppConstantFields.InitializeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File("E:\\SELENIUM\\Screenshot\\screen2.png");

		FileUtils.copyFile(SrcFile, DestFile);
		Thread.sleep(2000);
		driver.close();
	}

}
