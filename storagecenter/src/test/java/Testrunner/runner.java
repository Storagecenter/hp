package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/java/com/storage/storagecenter/CukeFeature/Example.feature",		
	plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"},
		glue="com.storage.storagecenter.Stepfedinition"
		)
public class runner {
	

}
