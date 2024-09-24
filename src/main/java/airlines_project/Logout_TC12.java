package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_TC12 
{
	ChromeDriver driver;
	@FindBy(xpath="//span[.='Hello, Anusha']")
	WebElement accounts;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	WebElement signout;
	
	@FindBy(id="createAccountSubmit")
		//	+ //input[@id='ap_email']")
			//+ "a-box-inner a-padding-extra-large")
	WebElement createaccountvisible;
	
	public void accountslist(ChromeDriver driver)

	{
		Actions a1= new Actions(driver);
		a1.moveToElement(accounts).perform();
	}
	public void SignOut()
	{
		signout.click();
	}
	public boolean LogoutDone()
	{
		return createaccountvisible.isDisplayed();
	}
	
	public Logout_TC12(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
