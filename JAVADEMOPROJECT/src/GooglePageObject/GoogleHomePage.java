package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage 
{
	
	WebDriver myD;

	public GoogleHomePage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}
	
	By GSTextField=By.className("gLFyf");
	By GSSubmit=By.name("btnK");
	
	public WebElement GSTextField()
	{
		return myD.findElement(GSTextField);
	}
	
	public WebElement GSSubmit()
	{
		
		return myD.findElement(GSSubmit);
		
	}
	
	
	
	

}
