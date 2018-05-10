package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;		

@CucumberOptions(features="Features", glue={"stepDefinition"})						
public class Runner extends AbstractTestNGCucumberTests
{		
	
}
