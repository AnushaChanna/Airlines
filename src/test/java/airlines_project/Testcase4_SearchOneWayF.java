package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;

@Listeners(Utility_Airlines.Listeners.class)
public class Testcase4_SearchOneWayF extends Airlines_BM_AM
{

	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void OneWayTrip() throws EncryptedDocumentException, IOException
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
		
		String b1=s1.AddReturn();
		Assert.assertEquals(b1, "Add Return");
		
	}
	
	
}
