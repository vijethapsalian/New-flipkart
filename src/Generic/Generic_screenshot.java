package Generic;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot {
public void capturePhoto(WebDriver driver)
{
	String photo="./photo/";
	Date d=new Date();
	String d1 = d.toString();
	String date = d1.replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(photo+date+".jpeg");
	
	
}
}
