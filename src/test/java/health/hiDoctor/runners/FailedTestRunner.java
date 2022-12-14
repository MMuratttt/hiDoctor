package health.hiDoctor.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
        },
        glue = "health/hiDoctor/step_definitions",
        features = "@target/rerun.txt"
)


public class FailedTestRunner {
}
