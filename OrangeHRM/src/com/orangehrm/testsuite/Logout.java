package com.orangehrm.testsuite;

import java.io.IOException;

import javax.servlet.jsp.SkipPageException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pageclasses.Menu;

public class Logout extends BaseClass{
	@Test
	public void logoutTest() throws SkipPageException, IOException
	{
		String runMode=eo.getCellData(dataEngine,0,4,2);
		if(runMode.equals("N"))
			throw new SkipPageException("Logout test case skipped");
		Menu menu=PageFactory.initElements(driver,Menu.class);
		menu.logout();
	}
	

}
