package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flip_login {

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement lgnBtn;
	
	public flip_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userTbox(String username)
	{
		user.sendKeys(username);
	}
	
	public void pwdTbox(String pwrd)
	{
		pwd.sendKeys(pwrd);
	}
	
	public void clickBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		lgnBtn.click();
	}
	
	
	
}
