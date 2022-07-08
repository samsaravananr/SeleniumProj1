package TESTNGDEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class T001 
{

	// This is some Comment
	
		@Test (timeOut = 20000, groups = {"P1"})
		public void TS001() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.facebook.com");
		Thread.sleep(10000);
		//System.out.println(myD.getTitle());
		myD.findElement(By.xpath("//*[@id=\"email\"]")).click();
		String vTitle=myD.getTitle();
		//if (vTitle.equals("Facebook – log in or sign up"))
		
		if (vTitle.equalsIgnoreCase("facebook – log in or sign up"))
		{
			System.out.println("Title Verification PASSED");
		}
		else
		{
			System.out.println("Title Verification FAILED");
		}
		myD.close();
		}
	

}