package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="features/TestMeAppTest.feature",
		glue= {"stepDefinition"},
		plugin= {"json:target/CucumberReports.json"}
		)
public class TestMeAppTestRunner {

}
