package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T017 {
	
	public static String vAlertText;

	public static void main(String[] args) throws InterruptedException 
	{
		
		vAlertText="Sam";
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://demoqa.com/alerts");
		
		Thread.sleep(5000);
		
		myD.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(3000);
		myD.switchTo().alert().accept();
		
		myD.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(3000);
		myD.switchTo().alert().dismiss();
		System.out.println(myD.findElement(By.id("confirmResult")).getText());
		
		Thread.sleep(5000);
		
		myD.findElement(By.xpath("//*[@id='promtButton']")).click();
		Thread.sleep(3000);
		myD.switchTo().alert().sendKeys(vAlertText);
		myD.switchTo().alert().accept();
		
		if (myD.findElement(By.id("promptResult")).getText().contains(vAlertText))
		{
			System.out.println("TC001 Alert Text Verification - PASS");
			
		}
		
		else
		{
			System.out.println("TC001 Alert Text Verification - FAIL");
			
		}
		
		
		
		myD.close();
		
	}

}
