package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;
@Listeners(Utility_Airlines.Listeners.class)
public class Testcase11_PersonalDetails extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void PersonalDetails() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
		
		SeatSelection_TC8 seat=new SeatSelection_TC8(driver);
		seat.Dateclick();
		seat.SelectDate();
		//seat.OnePassenger();
		seat.Search();
		Thread.sleep(3000);
		seat.Book();
		seat.ProceedToTravelDetails();
		
		seat.AddAdult();
		seat.Gender();
		seat.Female();
		
		Thread.sleep(3000);
		
		PersonalDetails_TC11 p1=new PersonalDetails_TC11(driver);
		
		boolean b1=p1.FirstNameEnable();
		Assert.assertEquals(b1, true);
		seat.FirstName();
		
		boolean b2=p1.LastNameEnable();
		Assert.assertEquals(b2, true);
		seat.LastName();
		
		boolean b3=p1.Email();
		Assert.assertEquals(b3, true);
		
		boolean b4=p1.Mobile();
		Assert.assertEquals(b4, true);
		
	
	
	}
		
}
