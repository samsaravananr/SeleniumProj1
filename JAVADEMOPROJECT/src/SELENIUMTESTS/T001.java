package SELENIUMTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T001 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.facebook.com");
		//System.out.println(myD.getTitle());
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


// API --> Web Based / Non Web Based