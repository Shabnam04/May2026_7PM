package org.xyz.auto.rediff;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertsFrames 
{

	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();   // launch the edge browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("signin-btn")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresult(driver,"handleAlerts");
		
		
	}
	
	@Test(enabled=true)
	public void handleFrames() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();   // launch the edge browser
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		driver.switchTo().defaultContent();  //will switch to original window content
		
		CaptureScreenshot.testresult(driver,"handleFrames");
		
	}
	
}
