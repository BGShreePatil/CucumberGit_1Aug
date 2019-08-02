package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="features\\PaymentProcess.feature",
			glue="stepDefinition",
			plugin= {"html:target/cucumber-reports/reports",
					"json:target/cucumber-reports/cucumberReports.json"
			}
		)
public class TestPaymentTestRunner {

}
