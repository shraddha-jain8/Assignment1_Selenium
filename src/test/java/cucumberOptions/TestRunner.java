package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//feature file
//step defination

	

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/feature/Login.feature",
								glue = "stepDefination")
	public class TestRunner extends AbstractTestNGCucumberTests{

}
