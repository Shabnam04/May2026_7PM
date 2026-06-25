package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario1 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase_1");
		
		Assert.assertEquals("Hello", "Hello TestNG");  //hard assertion
		
		System.out.println("first_testcase_2");
		
		Assert.assertEquals("Hello", "Hello TestNG");  //hard assertion
		
		System.out.println("first_testcase_3");
		
		Assert.assertEquals("Hello", "Hello TestNG");  //hard assertion
		
		
	}
	
	@Test(priority=2,groups="Smoke")
	public void second_testcase()
	{
		System.out.println("second_testcase_1");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello TestNG");
		
		System.out.println("second_testcase_2");
		
		sa.assertEquals("Hello", "Hello TestNG");
		
		sa.assertAll();
		
	}
	
	@Test(groups="Smoke")
	public void third_testcase()
	{
		System.out.println("third_testcase");
		
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(priority=-2,groups="Sanity")
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
