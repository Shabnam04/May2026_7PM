package org.wipro.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.wipro.automation.utilities.ReadPropFiles;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username_text(String uname) throws Exception
	{
		WebElement username_textbox = driver.findElement(By.id(ReadPropFiles.read_element_file("login_username_id")));
		username_textbox.sendKeys(uname);
	}
	
	public void enter_password_text(String pass) throws Exception
	{
		WebElement password_textbox = driver.findElement(By.name(ReadPropFiles.read_element_file("login_password_name")));
		password_textbox.sendKeys(pass);
	}
	
	public void click_login_bttn() throws Exception
	{
		WebElement login_bttn = driver.findElement(By.className(ReadPropFiles.read_element_file("login_login_bttn_class")));
		login_bttn.click();
	}
	
}
