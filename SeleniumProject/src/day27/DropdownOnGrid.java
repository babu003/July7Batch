package day27;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdownOnGrid {
	@Parameters("browser")
	@Test
	public void dropdownTest(String browser) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if(browser.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(browser.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL
				                                 ("http://localhost:4444/wd/hub"),cap);
		/*driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				System.out.println(dropdown.get(i).getText()+" is active");
			}
			else
			{
				System.out.println(dropdown.get(i).getText()+" is inactive");
			}
		}*/
		driver.get("http:/google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			//skip the hidden links
			if(links.get(i).isDisplayed())
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				//recreate the array list
				links=driver.findElements(By.tagName("a"));
			}
		}
	}

}
