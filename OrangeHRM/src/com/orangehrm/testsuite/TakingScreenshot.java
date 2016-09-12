package com.orangehrm.testsuite;

import java.io.IOException;

import javax.servlet.jsp.SkipPageException;

import org.testng.annotations.Test;

public class TakingScreenshot extends BaseClass{
	@Test
	public void screeshotTest() throws IOException, SkipPageException
	{
		String runMode=eo.getCellData(dataEngine,0,3,2);
		if(runMode.equals("N"))
			throw new SkipPageException("Screesnshot test case skipped");
		sc.captureScreenshot(driver,scrPath+"addemp.png");
	}

}
