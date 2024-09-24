package airlines_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Airlines.DDT_Airlines;


public class ValidLogin_TC2 extends DDT_Airlines
{
	@FindBy(id="a-autoid-1-announce")
	WebElement bookflightbutton;

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;

	@FindBy(xpath="//input[@aria-describedby='passwordErrorAnnounce']")
	WebElement password;
	
	@FindBy(className="_4f766984")
	WebElement flightpage;

	public void bookflightlogin()
	{
		bookflightbutton.click();
	}
	public void username()
	{
		email.sendKeys(un+ Keys.ENTER);
		
	}
	public void password()
	{
		password.sendKeys(pw + Keys.ENTER);
	}
	public boolean FlightPage()
	{
		return flightpage.isDisplayed();
	}
	
	
	public ValidLogin_TC2(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

