package org.xyz.auto.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JyothiClass {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser1() throws InterruptedException 
	{

		
		driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterMethod
    public void Closebrowser() {

      driver.quit();

	}

	@Test
	public void saucedemo_endtoend()
	{
		
		WebElement username_txtbox = driver.findElement(By.id("user-name"));

		username_txtbox.sendKeys("standard_user");

		WebElement password_txtbox = driver.findElement(By.name("password"));

		password_txtbox.sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();

		//driver.findElement(By.id("item_4_title_link")).click();

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		driver.findElement(By.className("shopping_cart_link")).click();

		System.out.println("checkout");

	}
}
	

