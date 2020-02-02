package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Generic_mouse_over;

public class flip_homepage {
@FindBy(xpath="//span[.='Women']")
private WebElement womenLink;

@FindBy(xpath="(//a[.='Sarees'])[1]")
private WebElement click;

@FindBy(xpath="(//div[@class='_2aUbKa'])[1]")
private WebElement clickLgt;

@FindBy(xpath="//div[.='Logout']")
private WebElement lgtBtn;



public flip_homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void womenOver(WebDriver driver) throws InterruptedException
{
	Thread.sleep(5000);
	Generic_mouse_over gs=new Generic_mouse_over();
	gs.mOver(driver, womenLink);
}
public void clickSaree() throws InterruptedException
{
	Thread.sleep(3000);
	click.click();
}
public void logOut(WebDriver driver) throws InterruptedException
{
	Thread.sleep(3000);
	Generic_mouse_over gs=new Generic_mouse_over();
	gs.mOver(driver, clickLgt);
}
public void clickLog() throws InterruptedException{
	Thread.sleep(3000);
	lgtBtn.click();
}


}
