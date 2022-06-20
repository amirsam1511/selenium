package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/feature", 
glue = "stepDefinition",
monochrome = true, 
publish = true )
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
