package org.wipro.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(className="signin-btn")
	WebElement login_bttn;

	public void enter_username_text(String uname) throws Exception
	{
		//WebElement username_textbox = driver.findElement(By.id(ReadPropFiles.read_element_file("login_username_id")));
		username_textbox.sendKeys(uname);
	}
	
	public void enter_password_text(String pass) throws Exception
	{
		//WebElement password_textbox = driver.findElement(By.name(ReadPropFiles.read_element_file("login_password_name")));
		password_textbox.sendKeys(pass);
	}
	
	public void click_login_bttn() throws Exception
	{
		//WebElement login_bttn = driver.findElement(By.className(ReadPropFiles.read_element_file("login_login_bttn_class")));
		login_bttn.click();
	}
	
}
