package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation3 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
	}
	
	@Test
	public void inputFieldsTest()
	{
		List<WebElement> myinput=driver.findElements(By.xpath
				       ("//input[@type='text' or @type='password' or @type='email']"));
		System.out.println(myinput.size());
		String[] str={"one","two","three","four","five","six","seven","eight"};
		for(int i=0;i<str.length;i++)
		{
			myinput.get(i).sendKeys(str[i]);
		}
	}

}
