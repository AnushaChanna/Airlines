package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValdiffClasses_TC6 
{
	@FindBy(xpath="(//span[.='Economy'])[1]")
	WebElement economyresult;
	
	@FindBy(xpath="//div[@class='sizeMedium a8cdd5cb']")
	WebElement selectclass;

	@FindBy(xpath="(//i[@class='_4b539ab8'])[2]")
	WebElement premiumeconomy;
	
	@FindBy(xpath="(//span[.='Premium Economy'])[1]")
	WebElement premiumeconomy_results;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[3]")
	WebElement business;
	
	@FindBy(xpath="(//span[.='Business'])[1]")
	WebElement business_results;
	
	public String EconomyResult()
	{
		return economyresult.getText();
	}
	
	public void PremiumEco ()
	{
		selectclass.click();
		premiumeconomy.click();
		selectclass.click();
	}
	
	public String PremiumEcoResults ()
	{
		return premiumeconomy_results.getText();
	}
	
	public void Business()
	{
		selectclass.click();
		business.click();
		selectclass.click();
	}
	
	public String BusinessResult()
	{
		return business_results.getText();
	}
	
	public ValdiffClasses_TC6(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
