package FleetRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        // Directory-level for multiple features

        features = "src/test/resources/features/FleetOrderCreate.feature",
        glue = "FleetStepsDefinitions",
        monochrome = false,
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },
        // tags = "@Smoke or @Regression",
        publish = true

)
public class orderUItest {

}
