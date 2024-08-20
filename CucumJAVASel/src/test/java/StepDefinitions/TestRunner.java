package StepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"StepDefinitions"},
plugin = {"pretty", "junit:target/JunitReports/report.xml",
		             "json:target/JSONReports/report.json",
		              "html:target/HTMLReports"}
)
public class TestRunner {

	
	
}
