package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;

@Listeners(Utility_Airlines.Listeners.class)

public class Testcase12_LoginSearchLogout extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void LoginSearchLogout() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
		
		SearchOneWayF_TC4 s1=new SearchOneWayF_TC4(driver);
		s1.search();
		
		Thread.sleep(3000);
		Logout_TC12 l1=new Logout_TC12(driver);
		
		l1.accountslist(driver);
		l1.SignOut();
		
	boolean b1 = l1.LogoutDone();
	Assert.assertEquals(b1, true);
		
	}

	
}
