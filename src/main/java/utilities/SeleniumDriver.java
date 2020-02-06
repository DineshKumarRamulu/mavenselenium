package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver 
{

private static WebDriver driver;
private static WebDriverWait driverwait;
private static SeleniumDriver SeleniumDriver;
public final static int timeout = 10;
public final static int pageloadtimeout =20;

public SeleniumDriver()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driverwait = new WebDriverWait(driver,timeout);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	//driver.get("http://newtours.demoaut.com/");
	
}

public static void launchurl(String url)
{
	//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Drivers\\chromedriver.exe");
	driver.get(url);
}

public static WebDriver getdriver()
{
	return driver;
}

}

