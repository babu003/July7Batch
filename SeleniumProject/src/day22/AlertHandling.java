package day22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AlertHandling {
	
	@Test
	public void alertTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		Sleeper.sleepTightInSeconds(5);
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
