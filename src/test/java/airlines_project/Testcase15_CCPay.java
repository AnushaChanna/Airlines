package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;
@Listeners(Utility_Airlines.Listeners.class)
public class Testcase15_CCPay extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void CCPayment() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
		
		SearchOneWayF_TC4 s1=new SearchOneWayF_TC4(driver);
		s1.OneWayTrip();
		s1.Destination();
		s1.Banglore();
		s1.search();
	
		SeatSelection_TC8 seat=new SeatSelection_TC8(driver);
		seat.Dateclick();
		seat.SelectDate();
		seat.OnePassenger();
		seat.Search();
		Thread.sleep(3000);
		seat.Book();
		seat.ProceedToTravelDetails();
		
		Thread.sleep(3000);
		seat.AddAdult();
		seat.Gender();
		seat.Female();
		seat.FirstName();
		seat.LastName();
		seat.AddAdultName();
	//	seat.PassengerOne();
		Thread.sleep(1000);
		seat.SeatSelection();
		
		CCPay_TC15 c1=new CCPay_TC15(driver);
		c1.SkipSelection();
		c1.TermsAndConds();
		c1.ProceedToPay();
		
		c1.CCselect();
		
		Thread.sleep(2000);
		c1.CCnum();
		c1.EnterCardDetails();
		
		boolean b1=c1.alertmess();
		Assert.assertEquals(b1, true);
		
	}
		
}