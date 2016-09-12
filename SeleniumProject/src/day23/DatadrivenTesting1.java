package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream file=new FileInputStream(".\\src\\com\\inetsolv\\excelfiles\\Login.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		String actMsg=null;
		for(int i=1;i<rowCount;i++)
		{
			r=ws.getRow(i);
			
			if(!r.getCell(0).getStringCellValue().equals("BLANK"))
			{
				driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
				
			}
			if(!r.getCell(1).getStringCellValue().equals("BLANK"))
			{
				driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			}
			driver.findElement(By.id("btnLogin")).click();
			try
			{
				 actMsg=driver.findElement(By.id("spanMessage")).getText();
			}
			catch(Exception e)
			{
				actMsg=driver.findElement(By.id("welcome")).getText();
			}
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtPassword")).clear();
			r.createCell(3).setCellValue(actMsg);
			String expMsg=r.getCell(2).getStringCellValue();
			if(actMsg.equals(expMsg))
			{
				r.createCell(4).setCellValue("Passed");
			}
			else
			{
				r.createCell(4).setCellValue("Failed");
			}
		}
		FileOutputStream f=new FileOutputStream(".\\src\\com\\inetsolv\\excelfiles\\Login.xlsx");
		wb.write(f);
		wb.close();
	}

}
