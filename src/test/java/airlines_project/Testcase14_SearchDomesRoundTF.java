package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;
@Listeners(Utility_Airlines.Listeners.class)
public class Testcase14_SearchDomesRoundTF extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void SearchDomesticTrip() throws EncryptedDocumentException, IOException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
		
		SearchDomesRoundTF_TC14 s1=new SearchDomesRoundTF_TC14(driver);
		s1.SelectRoundTrip();
		s1.RoundTripSearch();
		
		boolean b1=s1.RoundTripResults();
		Assert.assertEquals(b1, true);
		
		
	}
		
}