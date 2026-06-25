package org.xyz.auto.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DifferentConytrol 
{

	@Test
	public void tc01_login_functionality() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();   // launch the edge browser
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("login1")).sendKeys("it_john");
		
		//driver.findElement(By.id("login1")).clear();
		
		driver.findElement(By.id("login1")).sendKeys("David");
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
	}
	
}
