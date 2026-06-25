package org.wipro.automation.testcases;


import org.testng.annotations.Test;
import org.wipro.automation.base.Initialisation;
import org.wipro.automation.data.DDClass;
import org.wipro.automation.pages.RegisterPage;

public class RegsiterScenario extends Initialisation
{

	@Test
	public void TC03_valid_rediffmail_creation() throws Exception
	{
		
		RegisterPage reg  = new RegisterPage(driver);
		
		reg.click_new_rediffmail_link();
		reg.enter_fullname_text("Johon");
		reg.enter_rediffmail_text("johon1");
		reg.enter_rediffpass_text("123456");
		reg.enter_rediffretypepass_text("123456");
		reg.select_dob_day("05");
		reg.select_dob_month("May");
		reg.select_dob_year("1990");
		reg.click_gender_female();
	
		
		
	}
	
	
	
}
