package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage 
{
	
	WebDriver myD;

	public GoogleSearchPage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}
	
	By ResultStat=By.id("result-stats");
	By Videos=By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a");
	
	
	public WebElement ResultSat()
	{
		return myD.findElement(ResultStat);
	}
	
	public WebElement Videos()
	{
		return myD.findElement(Videos);
	}

}
