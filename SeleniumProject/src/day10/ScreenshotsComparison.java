package day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotsComparison {

	
	public static void main(String[] args) throws IOException  {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.navigate().refresh();
		File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(FileUtils.contentEquals(srcFile1,srcFile2))
		{
			System.out.println("Images are same");
		}
		else
		{
			System.out.println("Images are different");
		}
	}

}





