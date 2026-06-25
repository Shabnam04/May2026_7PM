package org.xyz.auto.rediff;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_Automation {

	// to format the code - ctrl+shift+f

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws InterruptedException {

		driver = new EdgeDriver(); // launch the edge browser
		
		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));  //wait to load the page until 3 mins
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://mail.rediff.com/cgi-bin/login.cgi");

		String exp_login_page_title = "Rediffmail - Free Email for Login with Secure Access";

		String act_login_page_title = driver.getTitle();
		System.out.println(act_login_page_title);

		Assert.assertEquals(act_login_page_title, exp_login_page_title);

		

		Thread.sleep(2000);

	}

	@AfterMethod
	public void closeBrowser() {
	//	driver.quit();

	}

	@Test
	public void tc01_login_functionality() {

		String act_rediffmail_id_textbox = driver.findElement(By.xpath("//label[text()='Rediffmail ID :']")).getText();
		
		Assert.assertEquals(act_rediffmail_id_textbox, "Rediffmail ID :");
		
		WebElement username_txtbox = driver.findElement(By.id("login1"));
		username_txtbox.sendKeys("it_john");

		WebElement password_txtbox = driver.findElement(By.name("passwd"));
		password_txtbox.sendKeys("john1234");

		System.out.println(driver.findElement(By.className("signin-btn")).getLocation());
		
		System.out.println(driver.findElement(By.name("remember")).isSelected()); //true
		
		driver.findElement(By.name("remember")).click();
		
		System.out.println(driver.findElement(By.name("remember")).isSelected()); //false
		
		System.out.println(driver.findElement(By.className("signin-btn")).isEnabled()); //true
		
		System.out.println(driver.findElement(By.className("signin-btn")).isDisplayed()); //true
		
		//driver.findElement(By.className("signin-btn")).click();
		
		//System.out.println(driver.getPageSource());

	}

	@Test(enabled = true)
	public void tc02_register_functionality() {

		driver.findElement(By.linkText("Get a new Rediffmail ID")).click();
		
		

		String exp_register_page = "Rediffmail Free Unlimited Storage";
		String act_register_page = driver.getTitle();

		Assert.assertEquals(act_register_page, exp_register_page);

		
		String act_fullname_textbox = driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
		
		Assert.assertEquals(act_fullname_textbox, "Enter your full name");
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");

		Select dob_day = new Select(driver.findElement(By.cssSelector("[class='day']")));

		dob_day.selectByIndex(5);
		dob_day.selectByValue("06");
		dob_day.selectByVisibleText("08");
		
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='Select a Security Question']")), "Select a Security Question"));
		
		Select hintquestions = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		hintquestions.selectByVisibleText("What is the name of your first school?");
		

	}
}
