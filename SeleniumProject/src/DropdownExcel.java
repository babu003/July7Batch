import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DropdownExcel {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	@Test
	public void dropdownTest() throws IOException
	{
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\dropdown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			Row r=ws.createRow(i);
			r.createCell(0).setCellValue(dropdown.get(i).getText());
			
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				
				r.createCell(1).setCellValue("Passed");
			}
			else
			{
				r.createCell(1).setCellValue("Failed");
			}
		}
		FileOutputStream f=new FileOutputStream("C:\\users\\sai\\desktop\\dropdown.xlsx");
		wb.write(f);
		wb.close();
		

		
	}

}
