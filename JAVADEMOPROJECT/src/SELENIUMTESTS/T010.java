package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T010 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		//WebDriver myD=new FirefoxDriver();
		myD.get("https://www.mortgagecalculator.org/");
		myD.findElement(By.name("param[homevalue]")).sendKeys("4000");
		myD.findElement(By.id("downpayment")).sendKeys("400");
		myD.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
		myD.findElement(By.id("intrstsrate")).sendKeys("4.5");
		myD.findElement(By.name("cal")).click();
		
		String vEMI=myD.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		
		System.out.println(vEMI);
		
		myD.close();
		
		
		// THIS PROGRAM WAS CREATED USING COPY XPATH

	}
	
	
	

}


// API --> Web Based / Non Web Based