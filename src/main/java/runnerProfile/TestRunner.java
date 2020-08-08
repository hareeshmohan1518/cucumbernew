package runnerProfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Cucumber BDD\\cucumberBasics\\src\\main\\java\\feature\\dataDriven.feature", 
		glue="stepDefinition"
		//dryRun = true,
		//dryRun= false,
		//strict=true,
		//strict=false,
		//monochrome=true,
	//	format= {"pretty","html:test-outout", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
		
		)


public class TestRunner {

}
