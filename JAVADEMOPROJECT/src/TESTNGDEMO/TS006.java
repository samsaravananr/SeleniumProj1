package TESTNGDEMO;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TS006 
{
	
	@Test
	public void OpenBrowser()
	{
		System.out.println("Opening Browser....");
		Assert.assertEquals("SAM", "SAM");
	}
	
	@Test (dependsOnMethods = {"OpenBrowser"}, alwaysRun = true)
	public void CloseBrowser()
	{
		System.out.println("Closing Browser....");
	}
	
	//@Test (dependsOnMethods = {"CloseBrowser"})
	
	//@Test(enabled = false, timeOut = 20000)
	@Test(enabled = true, timeOut = 20000)
	public void Signout()
	{
		System.out.println("Clear Cache....");
		Assert.assertEquals("SAM", "SAM");
	
	}
	
	
	
	

}
