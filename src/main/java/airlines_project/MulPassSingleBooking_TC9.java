package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MulPassSingleBooking_TC9 
{

	public MulPassSingleBooking_TC9(ChromeDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//button[.='2'])[1]")
	WebElement travellers;
	
	@FindBy(id="fl_lp_search")
	WebElement search;
	
	@FindBy(id="(//div[@class='ddd43014']/div/label/i)[1]")
	WebElement passengertwo;
	
	
	@FindBy(xpath="//input[@id='input-first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//span[.='0 of 2 seats']")
	WebElement seats;
	
	public void SelectTravellers()
	{
		travellers.click();
	}
	
	public void Search() 
	{
		search.click();
		
	}
	
	public void PassengerTwo() 
	{
		passengertwo.click();
		
	}
	
	public void FirstName_2()
	{
		firstname.sendKeys("Anusha");
	}
	
	public void LastName_2()
	{
		lastname.sendKeys("channa");
	}
	
	
	public boolean Seats() 
	{
		return seats.isDisplayed();
		
	}
	
}
