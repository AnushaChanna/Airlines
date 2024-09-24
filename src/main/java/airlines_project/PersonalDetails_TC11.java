package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_TC11 
{

	public PersonalDetails_TC11(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@id='input-first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	public boolean FirstNameEnable() 
	{
		
		return firstname.isEnabled();
	}

	public boolean LastNameEnable() {
		
		return lastname.isEnabled();
	}

	public boolean Mobile() {
		
		return mobile.isEnabled();
	}

	public boolean Email() {
		
		return email.isEnabled();
	}
	
	
	
	
	
	
	
	
	
	
	
}
