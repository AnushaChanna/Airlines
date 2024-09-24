package airlines_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Invalid_TC3 
{
	@FindBy(id="a-autoid-1-announce")
	WebElement bookflightbutton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(id="auth-error-message-box")
	WebElement WarnPopup;
	
	public void bookflightlogin()
	{
		bookflightbutton.click();
	}
	public void username()
	{
		email.sendKeys("987vsdfv432" + Keys.ENTER);
		
	}
	public void password()
	{
		password.sendKeys("efefwvc" +Keys.ENTER);
	}
	
	public boolean PopupMessage()
	{
		return WarnPopup.isDisplayed();
	}
	
	
	public  Invalid_TC3(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
