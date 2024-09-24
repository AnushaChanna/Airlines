package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;


@Listeners(Utility_Airlines.Listeners.class)
public class Testcase13_ApplyCoupon  extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void ApplyCoupon() throws EncryptedDocumentException, IOException, InterruptedException
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
		
		
		ApplyCoupon_TC13 a1=new ApplyCoupon_TC13(driver);
		a1.ApplyCoupon();
		
		boolean b1=a1.CouponApplied();
		Assert.assertEquals(b1, true);
	}
		
}