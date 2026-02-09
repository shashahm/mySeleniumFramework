package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"},
        glue = {"stepDefinitions"},
        tags = "@login",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/cucumber_report.html","json:target/cucumber_report.json"}
)
public class MainRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
