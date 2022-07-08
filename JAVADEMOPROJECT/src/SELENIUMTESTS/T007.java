package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T007 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.google.com");
		int vCount=myD.findElements(By.tagName("a")).size();
		System.out.println("Total Count is "+vCount);
		

	}
	
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}
	
	

}


// API --> Web Based / Non Web Based