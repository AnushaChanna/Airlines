package airlines_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Utility_Airlines.DDT_Airlines;

public class Testcase10_ValAllDetailsTillEnd extends Airlines_BM_AM
{
	@Test(retryAnalyzer=Utility_Airlines.RetryTC.class)
	public void ValidateTillEnd() throws EncryptedDocumentException, IOException
	{
		DDT_Airlines d1=new DDT_Airlines();
		d1.logincredentials();
		
		ValidLogin_TC2 v1=new ValidLogin_TC2(driver);
		v1.bookflightlogin();
		v1.username();
		v1.password();
}
}