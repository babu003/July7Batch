package day9;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadLessTesting1 {


	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}





