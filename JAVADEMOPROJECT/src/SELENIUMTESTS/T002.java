package SELENIUMTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T002 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\geckodriver.exe");
		//WebDriver myD=new ChromeDriver();
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.facebook.com");
		System.out.println("TITLE IS "+myD.getTitle());
		System.out.println("URL IS "+myD.getCurrentUrl());
		
		myD.close();

	}

}


// API --> Web Based / Non Web Based