package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatSelection_TC8
{
	
	@FindBy(xpath="(//div[@class='_79bb5d49'])[1]")
	WebElement date;
	
	@FindBy(xpath="(((//div[@class='_1711da50'])[2]/div)[3]/ul/li)[9]")
	WebElement dateselect;
	
	@FindBy(xpath="(//button[.='1'])[1]")
	WebElement onepass;
	
	@FindBy(xpath="(//button[.='Book'])[5]")
	WebElement book;
	
	@FindBy(xpath="//button[.='Proceed to traveller details']")
	WebElement proceedtotraveldetails;
	
	@FindBy(id="fl_tr_add")
	WebElement addadult;
	
	@FindBy(xpath="//div[@class='edb7cb84']")
	WebElement selectbutton;
	
	@FindBy(xpath="(//div[@class='edb7cb84']/ul/li)[2]")
	WebElement female;
	
	@FindBy(xpath="//input[@id='input-first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//button[.='Add adult']")
	WebElement addadultname;
	
	@FindBy(xpath="//button[.='Proceed to seat selection']")
	WebElement Proccedtoseat;
	
	@FindBy(xpath="//div[@data-selectedseat='4E']")
	WebElement seatsavailable;
	
	@FindBy(xpath="(//div[@class='ddd43014']/div/label/i)[2]")
	WebElement passone;
	
	@FindBy(id="fl_lp_search")
	WebElement search;
	
	public void Dateclick()
	{
		date.click();
	}
	public void SelectDate()
	{
		dateselect.click();
		
	}
	
	public void OnePassenger()
	{
		onepass.click();
		
	}
	public void Search() 
	{
		search.click();
		
	}
	
	public void Book()
	{
		book.click();
	}
	
	public void ProceedToTravelDetails()
	{
		proceedtotraveldetails.click();
	}
	
	
	public void AddAdult()
	{
		addadult.click();
	}
	public void Gender()
	{
		selectbutton.click();
	}
	
	public void Female()
	{
		
		female.click();
	}
	
	public void FirstName()
	{
		firstname.sendKeys("Anusha");
	}
	
	public void LastName()
	{
		lastname.sendKeys("ch");
	}
	
	public void AddAdultName()
	{
		addadultname.click();
	}
	public void SeatSelection()
	{
		Proccedtoseat.click();
	}
	public boolean SeatsVisible()
	{
		 return seatsavailable.isDisplayed();
	}
	
	public void PassengerOne()
	{
		passone.click();
	}
	
	
	
	public SeatSelection_TC8(ChromeDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}
	
}
