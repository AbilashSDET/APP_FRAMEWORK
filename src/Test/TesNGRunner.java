package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "Resources",
	    glue = "Test",
	    plugin = {"pretty", "html:target/cucumber-html-report.html"}
	)

public class TesNGRunner extends AbstractTestNGCucumberTests{
	
}
