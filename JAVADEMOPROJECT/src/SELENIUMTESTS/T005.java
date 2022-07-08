package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T005 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com");
		myD.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		myD.findElement(By.name("btnK")).click();
		
		String vTitle=myD.getTitle();
		
		if (vTitle.contains("Google Search"))
		{
			System.out.println("TC001 PASS");
		}
		else
		{
			System.out.println("TC001 FAIL");
		}
		
		//myD.findElement(By.linkText("Sign in")).click();
		
		

	}

}


// API --> Web Based / Non Web Based