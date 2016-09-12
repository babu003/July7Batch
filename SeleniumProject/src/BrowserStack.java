import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class BrowserStack {
	@Test
	public void sampleTest() throws MalformedURLException
	{
		String USERNAME = "inetssolvjira";
		String ACCESS_KEY = "612848dc-53ab-4fa3-a901-3800100f3425";
		String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		
		WebDriver driver=null;
		
		DesiredCapabilities caps = DesiredCapabilities.safari();
		caps.setCapability("platform", "OS X 10.10");
		caps.setCapability("version", "8.0");
		driver=new RemoteWebDriver(new URL(URL),caps);
		driver.get("http://google.com");
	}

}
