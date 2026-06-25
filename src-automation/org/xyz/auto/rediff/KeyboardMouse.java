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

public class KeyboardMouse 
{

	@Test(enabled=false)
	public void handlekeyboard() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();   // launch the edge browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("it_john").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("pass1234").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
	@Test(enabled=true)
	public void handleMouse() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();   // launch the edge browser
		
		driver.get("https://www.mphasis.com/home.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//right click
	//	act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//driver.findElement(By.xpath("//a[text()='Our Approach']")).click();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.dragAndDrop(source_element, target_element);
		//https://demoqa.com/droppable
		
	//	act.click(driver.findElement(By.xpath("//span[contains(text(),'HealthCare')]"))).perform();
		
		//ctrl+click
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'HealthCare')]"))).keyUp(Keys.CONTROL).perform();
		
		
		Set<String> windowsid = driver.getWindowHandles();
		
		//System.out.println(windowsid); 
		
		Iterator<String> itr = windowsid.iterator();
		
		String home = itr.next();
		String career = itr.next();
		
		
		
		driver.switchTo().window(career);
		
		
		
		
		
		
		
	}
	
}
