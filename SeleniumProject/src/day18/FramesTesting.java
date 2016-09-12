package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramesTesting {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void framestest()
	{
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
	}

}
