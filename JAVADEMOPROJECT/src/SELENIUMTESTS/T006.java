package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T006 {

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
		
		//myD.findElement(By.linkText("Sign in")).click();
		
		myD.findElement(By.partialLinkText("Sign")).click();
		myprint(myD.getTitle());
		myD.close();
		

	}
	
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}
	
	

}


// API --> Web Based / Non Web Based