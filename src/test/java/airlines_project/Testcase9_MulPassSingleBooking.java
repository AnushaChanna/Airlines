package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;

@Listeners(Utility_Airlines.Listeners.class)
public class Testcase9_MulPassSingleBooking extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void MulPassSingleBooking() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		MulPassSingleBooking_TC9 m1=new MulPassSingleBooking_TC9(driver);
		m1.SelectTravellers();
		m1.Search();
		
		Thread.sleep(3000);
		seat.Book();
		seat.ProceedToTravelDetails();
		
		//seat.PassengerOne();
		Thread.sleep(1000);
		//m1.PassengerTwo();
		
		seat.AddAdult();
		seat.Gender();
		seat.Female();
		seat.FirstName();
		seat.LastName();
		seat.AddAdultName();
		
		Thread.sleep(3000);
		
		seat.AddAdult();
		seat.Gender();
		seat.Female();
		m1.FirstName_2();
		m1.LastName_2();
		seat.AddAdultName();
		
		Thread.sleep(1000);
		
		seat.SeatSelection();
	
		boolean b1=m1.Seats();
		Assert.assertEquals(b1, true);
		
		
	}
}
