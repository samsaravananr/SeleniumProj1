package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleVideosPage 
{
	
	WebDriver myD;

	public GoogleVideosPage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}

	By ResultStat=By.id("result-stats");
	
	public WebElement ResultStat()
	{
		return myD.findElement(ResultStat);
	}

}
