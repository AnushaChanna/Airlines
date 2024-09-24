package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;
@Listeners(Utility_Airlines.Listeners.class)
public class Testcase6_ValidateSearchdiffClasses extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void DiffEconomies() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
		
		SearchOneWayF_TC4 s1=new SearchOneWayF_TC4(driver);
		s1.OneWayTrip();
		s1.search();
		
		ValdiffClasses_TC6 vdc=new ValdiffClasses_TC6(driver);
		
		String g1=vdc.EconomyResult();
		Assert.assertEquals(g1, "Economy");
		
		Thread.sleep(3000);
		vdc.PremiumEco();
		String g2=vdc.PremiumEcoResults();
		Assert.assertEquals(g2, "Premium Economy");
	
		Thread.sleep(3000);
		vdc.Business();
		String g3=vdc.BusinessResult();
		Assert.assertEquals(g3, "Business");
		
	}
		
}