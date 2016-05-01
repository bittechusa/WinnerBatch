import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/bittech/Documents/workspace/BddProject/log.feature"},format = {"json:target/cucumber.json"},tags={"@tag1"})
public class Runner {

}
