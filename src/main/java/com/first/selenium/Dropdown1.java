package com.first.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver exe File\\80\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*WebElement ele = driver.findElement(By.id("ui fluid search dropdown"));
		Select se = new Select(ele);
		se.selectByIndex(1);
		se.selectByValue("AR");
		se.selectByVisibleText("Alabama");
*/
		
		
	
		
		List<WebElement> stateList =driver.findElements(By.xpath("//div[@class=\"html\"]/div[@class=\"ui fluid search dropdown selection multiple upward\"]/select\r\n" + 
				""));
		System.out.println(stateList.size());
		
		for(WebElement e : stateList)
		{
			if(e.getText().equals("Alabama"))
			{
				e.click();
			}
		}
		
	}
}
