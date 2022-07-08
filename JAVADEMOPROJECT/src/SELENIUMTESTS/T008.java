package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T008 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://jqueryui.com/draggable/");
		int vCount=myD.findElements(By.tagName("iframe")).size();
		System.out.println("Total Count is "+vCount);
		

	}
	
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}
	
	

}


// API --> Web Based / Non Web Based