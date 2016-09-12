package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxTesting1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.echoecho.com/htmlforms09.htm");
	}
	
	@Test
	public void checkBoxTest()
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> checkbox=block.findElements(By.tagName("input"));
		for(int i=0;i<checkbox.size();i++)
		{
			System.out.println(checkbox.get(i).getAttribute("value")+"--"+checkbox.get(i).getAttribute("checked"));
		}
		System.out.println("################################################");
		for(int i=0;i<checkbox.size();i++)
		{
			if(checkbox.get(i).isSelected())
			{
				System.out.println(checkbox.get(i).getAttribute("value")+"--"+"It is checked");
			}
			else
			{
				System.out.println(checkbox.get(i).getAttribute("value")+"--"+"It is not checked");
			}
			
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
