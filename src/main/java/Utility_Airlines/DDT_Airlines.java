package Utility_Airlines;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT_Airlines 
{
	public static ChromeDriver driver;
	public static String un;
	public static String pw;
	
	@Test
	public void logincredentials() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream ("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
		Workbook w1=WorkbookFactory.create(file);
		un = NumberToTextConverter.toText(w1.getSheet("amazonlogin").getRow(0).getCell(0).getNumericCellValue());
		pw = w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
	
		
	}
	
}
