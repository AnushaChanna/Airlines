package airlines_project;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility_Airlines.Listeners;

public class Airlines_BM_AM extends Listeners
{

	@BeforeMethod
	public void login()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/s?k=amazon+flights&crid=EODYLZWB130X&sprefix=amazon+flights%2Caps%2C357&ref=nb_sb_noss_2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
	
	
	
}
