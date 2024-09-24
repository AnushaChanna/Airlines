package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValFlightDetails_TC10 
{
//Validate the flight information,Fare details,Baggage Rules and Cancellation
// Rules link has the details in the search result page.

	

	@FindBy(xpath="//div[@class='bbcaaa85']")
	WebElement flightinfo;
	
	@FindBy(xpath="//div[@class='_7c598c35 ']")
	WebElement viewbaggage;
	
	@FindBy(xpath="(//div[@class='_4c1235c7 _5d17b3c7 fe37375c']/div/div)[6]")
	WebElement baggage;
	
	@FindBy(xpath="(//div[@class='tabListInner'])[2]")
	WebElement cancellation;
	
	@FindBy(xpath="(//span[.='Non Refundable'])[2]")
	WebElement nonrefund;
	
	@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
	WebElement viewfaredetails;
	
	@FindBy(xpath="//div[@class='bb2c36c6 f3caf96d colorBase _6078df67']")
	WebElement faredetails;
	
	public boolean FlightInfo()
	{
		return flightinfo.isDisplayed();
	}
	
	
	public void ViewBaggage()
	{
		viewbaggage.click();
	}
	
	public boolean BaggageLimit()
	{
		return baggage.isDisplayed();
	}
	
	public void Cancellation()
	{
		cancellation.click();
		
	}
	
	public boolean NonRefundOnCancel ()
	{
		return nonrefund.isDisplayed();
	}
	
	public void ViewFareDetails()
	{
		viewfaredetails.click();
		
	}
	public boolean FareDetails ()
	{
		return faredetails.isDisplayed();
	}
	
	
	
	
	public ValFlightDetails_TC10(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
