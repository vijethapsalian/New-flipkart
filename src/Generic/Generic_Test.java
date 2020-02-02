package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Framework_CONSTANTS {
	public WebDriver driver;
@BeforeMethod
public void opnAplctn()
{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver=new FirefoxDriver();	
	driver.get("https://www.flipkart.com");
}
@AfterMethod
public void closeApplctn() throws InterruptedException
{
	Thread.sleep(4000);
	driver.close();
}
	
	
}
