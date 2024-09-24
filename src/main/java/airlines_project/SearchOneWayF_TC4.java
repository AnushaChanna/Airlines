package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOneWayF_TC4 
{
	@FindBy(xpath="(//i[@class='_4b539ab8'])[1]")
	WebElement oneway;
	
	@FindBy(xpath="//div[@class='_5edc825e']")
	WebElement destination;
	
	@FindBy(xpath="(//div[@class='_32608d65']/p)[13]")
	WebElement banglore;
	
	@FindBy(id="fl_lp_search")
	WebElement onewaysearch;
	
	
	@FindBy(xpath="//span[.='Add Return']")
	WebElement addreturn;
	
	public void OneWayTrip() 
	{
		oneway.click();
		
	}
	
	public void Destination() 
	{
		destination.click();
		
	}
	
	public void Banglore() 
	{
		banglore.click();
		
	}
	
	public void search() 
	{
		onewaysearch.click();
		
	}
	
	public String AddReturn() 
	{
		return addreturn.getText();
		
	}
	public SearchOneWayF_TC4(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
