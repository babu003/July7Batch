package com.orangehrm.testsuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.jsp.SkipPageException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orangehrm.pageclasses.LoginPage;

public class Login  extends BaseClass{
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws IOException, SkipPageException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		String runMode=eo.getCellData(dataEngine,0,1,2);
		if(runMode.equals("N"))
			throw new SkipPageException("Login test case skipped");
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.loginPanel("Admin","admin");
	}
	

}
