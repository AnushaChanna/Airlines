package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRoundTripF_TC5
{
	@FindBy(xpath="(//i[@class='_4b539ab8'])[2]")
	WebElement roundtripselect;
	
	@FindBy(className="b44c2cc8")
	WebElement roundtripsearch;
	
	@FindBy(xpath="(//div[@class='_285a55dc'])[2]")
	WebElement tripresults;
	
	public void SelectRoundTrip()
	{
		roundtripselect.click();		
	}
	
	public void RoundTripSearch() 
	{
		roundtripsearch.click();
		
	}
	
	public boolean RoundTripResults() 
	{
		return tripresults.isDisplayed();
		
	}
	public SearchRoundTripF_TC5(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	

}
