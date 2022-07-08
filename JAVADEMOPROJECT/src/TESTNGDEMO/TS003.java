package TESTNGDEMO;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TS003 extends TS004
{
	
	@BeforeTest
	public void setUP()
	{
		System.out.println("BEFORE TEST - OPEN BROWSER....!");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("AFTER TEST - Closing Browser");
	}

}
