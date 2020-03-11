package com.first.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassNew {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver exe
		// File\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		ele.click();

		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();

		Thread.sleep(2000);
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();

		Thread.sleep(2000);
		driver.close();

	}
}
