package Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.LoginPageaction;
import utilities.SeleniumDriver;

public class mercurysteps {
	
	LoginPageaction LoginPageaction = new LoginPageaction();
	

@Given("^I am on the Home page of Mercury Site \"([^\"]*)\"$")
public static void i_am_on_the_Home_page_of_Mercury_Site(String url) {
	//SeleniumDriver  Selenium= new SeleniumDriver();
	//WebDriver driver = SeleniumDriver.getdriver();
	SeleniumDriver.launchurl(url);
    
}

@And("^I enter the \"([^\"]*)\" username$")
public void i_enter_the_username(String name){
	LoginPageaction.EnterLoginname(name);
}

@And("^I enter the \"([^\"]*)\" password$")
public void i_enter_the_password(String password){

	LoginPageaction.Enterpassword(password);
}

@And("^I clickon the signin button$")
public void i_clickon_the_signin_button()  {
	
	LoginPageaction.clicksigninbutton();
	
}


@Then("^It should naviage to the Fight Finder page$")
public void it_should_naviage_to_the_Fight_Finder_page() {
	
	System.out.println("login successfull");
   
}



}
