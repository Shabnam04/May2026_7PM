package org.xyz.auto.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{

	@Test
	public void tc01_login_functionality() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();   // launch the edge browser
		driver.get("https://www.google.com/");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		
		//driver.close();  // will close only active window
		
		driver.quit();  //will close all the window (only opend by automated software)
		
	}
	
}
