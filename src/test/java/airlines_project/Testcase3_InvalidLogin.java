package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;
@Listeners(Utility_Airlines.Listeners.class)
public class Testcase3_InvalidLogin extends Airlines_BM_AM
{

	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void validlogin() throws EncryptedDocumentException, IOException
	{
	 DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();

		Invalid_TC3 v1=new Invalid_TC3(driver);
		v1.bookflightlogin();
		v1.username();
		//v1.password();
		
		boolean b1=v1.PopupMessage();
		Assert.assertEquals(b1, true);
}}
