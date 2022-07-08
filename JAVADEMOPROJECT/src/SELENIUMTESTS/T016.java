package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T016 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		
		myD.get("https://www.spicejet.com/search?from=STV&to=AGR&tripType=1&departure=2022-06-14&adult=1&child=0&infant=0&currency=INR&specialCategory=SNTZ&redirectTo=/");
		
		Thread.sleep(5000);
		
		String vCoupon=myD.findElement(By.xpath("//*[@class='css-76zvg2 r-1i10wst r-1kfrs79']")).getText();
		
		System.out.println(vCoupon);
		
		if (vCoupon.contains("Senior Citizen"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		myD.close();
		
	}

}
