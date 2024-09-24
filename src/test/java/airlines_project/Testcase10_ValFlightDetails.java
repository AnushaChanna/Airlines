package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;


public class Testcase10_ValFlightDetails extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void ValidateTillEnd() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		ValFlightDetails_TC10 f1=new ValFlightDetails_TC10(driver);
		
		boolean b1=f1.FlightInfo();
		Assert.assertEquals(b1, true);
		
		f1.ViewBaggage();
		
		boolean b2=f1.BaggageLimit();
		Assert.assertEquals(b2, true);
		
		f1.Cancellation();
		
		boolean b3=f1.NonRefundOnCancel();
		Assert.assertEquals(b3, true);
		
		f1.ViewFareDetails();
		
		boolean b4=f1.FareDetails();
		Assert.assertEquals(b4, true);
}
}