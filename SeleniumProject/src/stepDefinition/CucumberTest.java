package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest {
	static FirefoxDriver driver;
	@Given("^the browser is launched and navigated to the orangehrm login page$")
	public void the_browser_is_launched_and_navigated_to_the_orangehrm_login_page() throws Throwable {
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on the sigin button$")
	public void click_on_the_sigin_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display a msg welcome admin$")
	public void it_should_display_a_msg_welcome_admin() throws Throwable {
		String expmsg="Welcome Admin";
	    String actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actmsg, expmsg);
	}
	
	
	
	@When("^we click on welcome admin link$")
	public void we_click_on_welcome_admin_link() throws Throwable {
	    driver.findElement(By.id("welcome")).click();
	}

	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
	   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}

	@Then("^it should display the home page$")
	public void it_should_display_the_home_page() throws Throwable {
	    String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	}

}
