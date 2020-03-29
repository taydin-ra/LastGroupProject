package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        glue={"stepDefinition"},
        features = {"src/test/resources"},
        tags="@SmokeTest",


        dryRun = false


)
public class smokeTestRunner {
}
