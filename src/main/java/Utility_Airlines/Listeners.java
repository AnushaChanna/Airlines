package Utility_Airlines;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener
{
	public static ChromeDriver driver;

	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("testcase is pass > report from Listeners");
		
		TakesScreenshot ts=driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Airlines_Screenshot\\Pass\\airline"+Math.random()+".png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("testcase is fail > report from Listeners");
		
		TakesScreenshot ts=driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Airlines_Screenshot\\Fail\\airlines"+Math.random()+".png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
