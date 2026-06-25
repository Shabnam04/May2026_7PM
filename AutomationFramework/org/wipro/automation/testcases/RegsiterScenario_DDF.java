package org.wipro.automation.testcases;


import org.testng.annotations.Test;
import org.wipro.automation.base.Initialisation;
import org.wipro.automation.data.DDClass;
import org.wipro.automation.pages.RegisterPage;

public class RegsiterScenario_DDF extends Initialisation
{

	@Test(dataProvider="register",dataProviderClass=DDClass.class)
	public void TC03_valid_rediffmail_creation(String fullname, String email,String password, String retypepass, String day, 
			String month, String year) throws Exception
	{
		
		RegisterPage reg  = new RegisterPage(driver);
		
		reg.click_new_rediffmail_link();
		reg.enter_fullname_text(fullname);
		reg.enter_rediffmail_text(email);
		reg.enter_rediffpass_text(password);
		reg.enter_rediffretypepass_text(retypepass);
		reg.select_dob_day(day);
		reg.select_dob_month(month);
		reg.select_dob_year(year);
		reg.click_gender_female();
	
		
		
	}
	
	
	
}
