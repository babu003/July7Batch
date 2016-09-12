package com.orangehrm.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	
	@FindBy(linkText="Welcome Admin")
	WebElement welcomeAdmin;
	@FindBy(linkText="About")
	WebElement about;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void about()
	{
		welcomeAdmin.click();
		Sleeper.sleepTightInSeconds(2);
		about.click();
	}
	public void logout()
	{
		welcomeAdmin.click();
		Sleeper.sleepTightInSeconds(4);
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
