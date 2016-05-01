import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/bittech/Documents/workspace/BddProject/win.feature"},format = {"json:target/cucumber1.json"},tags={"@p"})
public class Runner1 {

}
