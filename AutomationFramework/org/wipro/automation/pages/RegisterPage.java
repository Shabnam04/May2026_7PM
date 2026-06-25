package org.wipro.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.utilities.ReadPropFiles;

public class RegisterPage 
{

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Click RediffmailID
	
	public void click_new_rediffmail_link() throws Exception
	{
		WebElement newrediffmail_link = driver.findElement(By.xpath(ReadPropFiles.read_element_file("login_getnewrediffmail_xpath")));
		newrediffmail_link.click();
	}
	
	
	public void enter_fullname_text(String fullname) throws Exception
	{
		WebElement fullname_textbox = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_fullname_css")));
		fullname_textbox.sendKeys(fullname);
	}
	
	public void enter_rediffmail_text(String email) throws Exception
	{
		WebElement rediffmail_textbox = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_email_css")));
		rediffmail_textbox.sendKeys(email);
	}
	

	public void enter_rediffpass_text(String password) throws Exception
	{
		WebElement rediffpass_textbox = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_password_css")));
		rediffpass_textbox.sendKeys(password);
	}
	

	public void enter_rediffretypepass_text(String retypepassword) throws Exception
	{
		WebElement rediffretypepass_textbox = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_retypepass_css")));
		rediffretypepass_textbox.sendKeys(retypepassword);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		WebElement dob_day_element = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_dob_day_css")));
		Select dob_day = new Select(dob_day_element);
		dob_day.selectByVisibleText(day);
		
	}
	
	public void select_dob_month(String month) throws Exception
	{
		WebElement dob_month_element = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_dob_month_css")));
		Select dob_month = new Select(dob_month_element);
		dob_month.selectByVisibleText(month);
		
	}
	

	public void select_dob_year(String year) throws Exception
	{
		WebElement dob_year_element = driver.findElement(By.cssSelector(ReadPropFiles.read_element_file("register_dob_year_css")));
		Select dob_year = new Select(dob_year_element);
		dob_year.selectByVisibleText(year);
		
	}
	
	public void click_gender_female() throws Exception
	{
		WebElement gender_female = driver.findElement(By.xpath(ReadPropFiles.read_element_file("register_gender_female_xpath")));
		gender_female.click();
	}
	
	
	
	
	
	


	
}
