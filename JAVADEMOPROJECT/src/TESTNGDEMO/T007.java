package TESTNGDEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class T007 
{

	
		@Test (timeOut = 20000, groups = {"P1"})
		public void TS001() throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\geckodriver.exe");
		//WebDriver myD=new ChromeDriver();
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com");
		Thread.sleep(10000);
		System.out.println(myD.getTitle());
		
				myD.close();
		}
	

}