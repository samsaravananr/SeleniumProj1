package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T004 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.facebook.com");
		myD.findElement(By.id("email")).sendKeys("samsaravananr");
		myD.findElement(By.name("pass")).sendKeys("12345");
		myD.findElement(By.name("login")).click();
		
		

	}

}


// API --> Web Based / Non Web Based