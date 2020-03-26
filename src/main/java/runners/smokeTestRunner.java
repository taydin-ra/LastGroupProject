package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
        },
        glue={"stepDefinition"},
        features = {"src/test/resources"},
        tags="@SmokeTest",


        dryRun = false


)
public class smokeTestRunner extends AbstractTestNGCucumberTests {
}
