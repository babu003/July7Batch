package day30;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight  extends BaseClass{
	@Test
	public void bookAFlightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("passLast0")).sendKeys("Krishna");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		driver.findElement(By.name("buyFlights")).click();
	}

}
