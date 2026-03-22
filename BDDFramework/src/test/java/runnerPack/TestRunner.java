package runnerPack;

import org.testng.annotations.Listeners;

import hooks.ListenerClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





@Listeners(ListenerClass.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\features",
		glue = {"stepDefinitions", "hooks"},
		tags = "@Test"
		)
public class TestRunner extends AbstractTestNGCucumberTests
{
	
//	Configure paths of feature files,step definition path, hooks package
	
	

}
