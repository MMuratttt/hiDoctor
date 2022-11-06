package com.bb2.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target//rerun.txt",
        },
        features = "src/test/resources/features",
        glue = "com/bb2/step_definitions",
        dryRun = false,
        //       tags = "@wip or @regression or @smoke",
        publish = true
)
public class CukesRunner {

}
