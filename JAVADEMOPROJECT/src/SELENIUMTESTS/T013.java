package SELENIUMTESTS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class T013 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://jqueryui.com/droppable/");
		String vText1=myD.findElement(By.className("entry-title")).getText();
		System.out.println(vText1);
		
		
		
		//myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
		
		//myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		myD.switchTo().frame(0);
		
		
		String vText2=myD.findElement(By.id("draggable")).getText();
		System.out.println(vText2);
				
		Thread.sleep(5000);
		
		myD.quit();
		
		
		// THIS PROGRAM WAS CREATED USING COPY XPATH

	}
	
	
	

}


// API --> Web Based / Non Web Based