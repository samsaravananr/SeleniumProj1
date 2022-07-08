package TESTNGDEMO;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TS005 
{
	
	@Test (groups = {"P2"})
	public void OpenBrowser()
	{
		System.out.println("Opening Browser....");
		Assert.assertEquals("SAM", "SAMR");
	}
	
	@Test (dependsOnMethods = {"OpenBrowser"}, alwaysRun = true)
	public void CloseBrowser()
	{
		System.out.println("Closing Browser....");
	}

}
