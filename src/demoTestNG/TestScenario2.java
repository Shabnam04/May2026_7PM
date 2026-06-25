package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test(enabled=true)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void registration()
	{
		System.out.println("registration");
		
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	
	@Test(dependsOnMethods="registration")
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(groups="JulyRelease")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
