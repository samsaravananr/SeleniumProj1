package TESTNGDEMO;

import org.testng.annotations.Test;

public class TS002 extends TS003
{
	
	@Test (groups = {"P1"})
	public void A()
	{
		System.out.println("Input Method");
	}
	
	@Test (groups = {"P2"})
	public void B()
	{
		System.out.println("Output Method");
	}

}
