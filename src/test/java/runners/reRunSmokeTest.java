package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        glue = {"stepDefinition"},
        features = {"@target/rerun.txt"},  //this path has our failed test

        dryRun = false
)
public class reRunSmokeTest {
}
