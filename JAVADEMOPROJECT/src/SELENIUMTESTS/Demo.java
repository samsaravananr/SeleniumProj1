package SELENIUMTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook.com");
		//driver1.wait(1000);
		String title=driver1.getTitle();
		if (title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Title verification Passed");
		}
		else 
		{
			System.out.println("Title verification is failed");
		}
		driver1.close();
	 
	}


	}


