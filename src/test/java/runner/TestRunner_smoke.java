package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features= "src/test/resources/features",
        glue = {"stepdefs","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        monochrome = true,
        tags = "@smoke",
        publish = true)

public class TestRunner_smoke extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] scenario() {
        return super.scenarios();
    }

}
