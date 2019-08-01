package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		features="features/login.feature",
		glue="stepDefinition",
		plugin= {"json:target/cucumber-reports/CucumberReport.json"}
		)

public class LoginTestRunner {


}
