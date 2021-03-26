package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/seleniumCucumber/features/Login.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber/cucumber.json"}
)
public class TestRunner {
}
