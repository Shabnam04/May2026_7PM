package org.xyz.auto.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CalendarDemo 
{

	@Test
	public void calendar_icon() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();   // launch the edge browser
		
		driver.get("https://www.agoda.com/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
		
		driver.findElement(By.cssSelector("[aria-label='Fri Jun 05 2026']")).click();
		
		driver.findElement(By.cssSelector("[aria-label='Sun Jun 07 2026']")).click();
		
		
		
	}
	
	@Test(enabled=false)
	public void calendar_textbox() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();   // launch the edge browser
		
		driver.get("https://practice-automation.com/calendars/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2000-02-07");
		
		driver.findElement(By.cssSelector("[aria-label='Mon Feb 07 2000Use the space key to select the date.']")).click();
		
	}
	
}
