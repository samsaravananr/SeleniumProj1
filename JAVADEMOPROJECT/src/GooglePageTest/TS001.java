package GooglePageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GooglePageObject.GoogleHomePage;
import GooglePageObject.GoogleSearchPage;
import GooglePageObject.GoogleVideosPage;

public class TS001 
{
	
	public WebDriver myD;
	public String vStat;
	
	@Test
	public void Test1() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Downloads\\JavaIND\\chromedriver.exe");
		myD=new ChromeDriver();
		
		GoogleHomePage GH=new GoogleHomePage(myD);
		GoogleSearchPage GS=new GoogleSearchPage(myD);
		GoogleVideosPage GV=new GoogleVideosPage(myD);
		
		
		myD.get("https://www.google.com");
		myD.manage().window().maximize();
		myD.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		GH.GSTextField().sendKeys("SELENIUM");
		GH.GSSubmit().click();
		
		vStat=GS.ResultSat().getText();
		System.out.println("Google Search Result Statistics "+vStat);
		GS.Videos().click();
		
		vStat=GV.ResultStat().getText();
		System.out.println("Videos Search Result Statistics "+vStat);
		
		
		Thread.sleep(4000);
		
		myD.close();
		
		
		
		
		
		
		
		
	}

	
}
