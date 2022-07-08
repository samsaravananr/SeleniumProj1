package SELENIUMTESTS;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class T018 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		//myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		myD.get("https://www.amazon.in/");
		
		//WebElement WE1=);
		
		Actions actions=new Actions(myD);
		actions.moveToElement(myD.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//Thread.sleep(10000);
		
		myD.quit();
		
		
		// THIS PROGRAM WAS CREATED USING COPY XPATH

	}
	
	
	

}


// API --> Web Based / Non Web Based