package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.Loginpagelocator;
import utilities.SeleniumDriver;

public class LoginPageaction {
	
	//Loginpagelocator Loginpageloctor = null;
	Loginpagelocator Loginpage = new Loginpagelocator();
	SeleniumDriver Selenium = new SeleniumDriver();
	
	
	public LoginPageaction()
	{
		//this.Loginpageloctor = new Loginpagelocator();
		PageFactory.initElements(SeleniumDriver.getdriver(), Loginpage);
		
	}
	
	public void EnterLoginname(String name)
	{
		//PageFactory.initElements(SeleniumDriver.getdriver(), Loginpage);
		Loginpage.username.sendKeys(name);
	}
	
	public void Enterpassword(String password)
	{
		Loginpage.password.sendKeys(password);
	}
	
	public void clicksigninbutton()
	{
		Loginpage.signin.click();
	}
	

}
