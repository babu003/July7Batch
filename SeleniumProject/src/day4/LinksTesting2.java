package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl="http://www.bing.com/?scope=video&FORM=Z9LH2";
		String acturl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		if(expurl.equals(acturl))
		{
			System.out.println("videos link is working correctly");
		}
		else
		{
			System.out.println("videos link is not working correctly");
		}
		driver.close();
	}

}


