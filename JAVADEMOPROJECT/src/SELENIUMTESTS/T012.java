package SELENIUMTESTS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class T012 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.gmail.com");
		System.out.println(myD.getTitle());
		
		myD.findElement(By.linkText("Help")).click();
		
		Set<String> ids=myD.getWindowHandles();
		Iterator<String> it=ids.iterator();
	
		
		String parent=it.next();
		String child=it.next();
		
		myD.switchTo().window(child);
		
		
		
		System.out.println(myD.getTitle());
		
		myD.switchTo().window(parent);
		
		System.out.println(myD.getTitle());
		
		myD.navigate().to("https://www.google.com/");
		
		myD.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		myD.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		myD.quit();
		
		
		// THIS PROGRAM WAS CREATED USING COPY XPATH

	}
	
	
	

}


// API --> Web Based / Non Web Based