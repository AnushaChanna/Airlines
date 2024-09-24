package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyCoupon_TC13 
{
	@FindBy(xpath="(//div[@class='_657d20b7 f54be1b2 _0c6150e5 _6078df67'])[1]")
	WebElement copoun;
	
	@FindBy(xpath="//span[@class='dcb9db95 _44cc784d a9212bfd']")
	WebElement couponapplied;
	
	public void ApplyCoupon()
	{
		copoun.click();
	}
	
	public boolean CouponApplied()
	{
		return copoun.isDisplayed();
	}
	

	public ApplyCoupon_TC13(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
