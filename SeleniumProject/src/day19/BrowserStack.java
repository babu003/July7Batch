package day19;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BrowserStack {
	@Parameters("browser")
	@Test
	public void sampleTest(String b) throws MalformedURLException
	{
		System.out.println(b);
		String USERNAME = "inetssolvjira";
		String ACCESS_KEY = "612848dc-53ab-4fa3-a901-3800100f3425";
		String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		DesiredCapabilities caps=null;
		WebDriver driver=null;
		if(b.equals("chrome"))
		{
		caps = DesiredCapabilities.safari();
		caps.setCapability("platform", "OS X 10.10");
		caps.setCapability("version", "8.0");
		}
		else if(b.equals("firefox"))
		{
		    caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "46.0");
		}
		driver=new RemoteWebDriver(new URL(URL),caps);
		driver.get("http://newtours.demoaut.com");
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
		}
	}

}
