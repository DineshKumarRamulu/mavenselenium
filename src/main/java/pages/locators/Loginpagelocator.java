package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpagelocator {
	
@FindBy(how=How.XPATH,using="//input[@name='userName']")
public WebElement username;

@FindBy(how=How.XPATH,using="//input[@name='password']")
public WebElement password;

@FindBy(how=How.XPATH,using="//input[@name='login']")
public WebElement signin;



}
