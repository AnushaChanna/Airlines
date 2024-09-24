package airlines_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCPay_TC15
{
	public CCPay_TC15(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[@class='_918d7962 _5d17b3c7']/div)[1]")
	WebElement skipselection;
	
	@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
	WebElement terms_conds;
	
	@FindBy(xpath="//button[.='Proceed to Payment']")
	WebElement Proccedtopay;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement ccselect;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement ccnum;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	WebElement entercarddetails;
	
	@FindBy(xpath="//h4[@class='a-alert-heading']")
	WebElement alert;

	public void SkipSelection() 
	{
		skipselection.click();
	}

	public void TermsAndConds() 
	{
		
		terms_conds.click();
	}

	public void ProceedToPay() {
		
		Proccedtopay.click();
	}

	public void CCselect() {
		
		ccselect.click();
	}
	public void CCnum() {
	
		ccnum.sendKeys("23456798764322");
	}

	

	public void EnterCardDetails() {
		
		entercarddetails.click();
	}

	public boolean alertmess() {
		
		return alert.isDisplayed();
	}
	
}
