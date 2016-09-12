package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicXpaths {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
	}
	
	@Test
	public void xpathTest()
	{
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_14697')]/li[1]/a")).click();
	}

}
