package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Features"},
//features= {"src/Features"},
glue = {"Steps"}
		)
public class runcuke {

}
