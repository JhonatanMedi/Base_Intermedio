package Demoblaze.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "Demoblaze.Definitions"})

public class RunnersFeature {

}
