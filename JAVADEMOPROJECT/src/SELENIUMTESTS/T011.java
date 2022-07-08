package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class T011 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("http://www.youcandealwithit.com/");
		
		Actions act=new Actions(myD);
		
		act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).perform();
		
		//act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).moveToElement((WebElement) By.xpath("xpathExpression")).build().perform();
		
		myD.findElement(By.linkText("Calculators & Resources")).click();
		myD.findElement(By.linkText("Calculators")).click();
		myD.findElement(By.linkText("Budget Calculator")).click();
		
		Thread.sleep(5000);
		
		
		myD.close();
		
		
		// THIS PROGRAM WAS CREATED USING COPY XPATH

	}
	
	
	

}


// API --> Web Based / Non Web Based