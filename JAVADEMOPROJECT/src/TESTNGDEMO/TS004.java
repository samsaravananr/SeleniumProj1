package TESTNGDEMO;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TS004 
{
	
	@BeforeSuite
	public void startstuite()
	{
	System.out.println("BEFORE SUITE - Browser SETUP.....");	
	}
	
	@AfterSuite
	public void stopsuite()
	{
		System.out.println("AFTER SUITE - Clear Cache....");
	}
	

}
