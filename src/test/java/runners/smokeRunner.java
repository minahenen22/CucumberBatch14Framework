package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features =
                "src/test/resources/features/",
        glue = "steps",

        //when you set dry run to true, will stop actual execution
        //will quickly scan all the gherkin steps if emplemented or not

        dryRun = false,
        //when we set dryRun to false will srats the executions
        tags ="@tc1105", // tags = "@aprint3 or @sprint1"

        // to remove irrelevant info from console, set monochrome to true
        monochrome = false,

        //pretty prints the steps in the console to increase readability
        //to generate reports we need plugin of runner class
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
                "rerun:target/failed.txt"}
            //failed.txt file holds all scenarios which are falied during execution
)
public class smokeRunner {

}
