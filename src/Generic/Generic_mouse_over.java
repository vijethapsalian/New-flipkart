package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_mouse_over {
public void mOver(WebDriver driver,WebElement ele)
{
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
}
}
