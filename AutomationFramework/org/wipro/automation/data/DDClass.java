package org.wipro.automation.data;

import org.testng.annotations.DataProvider;

public class DDClass
{

	@DataProvider(name="login")
	public Object[][] login_data()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};   //1-dimensional array
		Object[][] data3 = {{"correct_user1","correct_pass1"},{"correct_user2","wrong_pass2"},{"wrong_user3","any_pass3"}};   //2-dimensional array
		return data3;
	}
	
	
	@DataProvider(name="register")
	public Object[][] register_data()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};   //1-dimensional array
		Object[][] data3 = {{"john","john1","1234","1234","05","NOV","1986"},{"David","david1","241241","241241","06","OCT","1990"},
				{"Neena","neena1","n2020","n2020","07","JUN","1989"}};   //2-dimensional array
		return data3;
	}
	
}
