package org.wipro.automation.testcases;


import org.testng.annotations.Test;
import org.wipro.automation.base.Initialisation;
import org.wipro.automation.data.DDClass;
import org.wipro.automation.pages.LoginPage_PF;

public class LoginScenario_DDF extends Initialisation
{

	@Test(dataProvider="login",dataProviderClass=DDClass.class)
	public void TC02_valid_Account_Login(String username, String password) throws Exception
	{
		
		LoginPage_PF login  = new LoginPage_PF(driver);
		
		login.enter_username_text(username);
		login.enter_password_text(password);
		login.click_login_bttn();
		
		
	}
	
	
	
}
