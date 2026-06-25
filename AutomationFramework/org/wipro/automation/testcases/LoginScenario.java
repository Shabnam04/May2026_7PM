package org.wipro.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.base.Initialisation;
import org.wipro.automation.pages.LoginPage_PF;

public class LoginScenario extends Initialisation
{

	@Test
	public void TC02_valid_Account_Login() throws Exception
	{
		
		LoginPage_PF login  = new LoginPage_PF(driver);
		
		login.enter_username_text("it_john");
		login.enter_password_text("pass24566");
		login.click_login_bttn();
		
		//because "this.driver" is null
		
	}
	
}
