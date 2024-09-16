package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//folder name for features and package name for step definition
@RunWith(Cucumber.class) 
@CucumberOptions(
				features={"src/test/resources/Features/Logindatatable.feature"},
				 glue={"stepdefinition"},
				 tags="@test"
				 //dryRun=true // Console only prints pass or fail not all the steps

				)  
public class Runtest {
	

}
