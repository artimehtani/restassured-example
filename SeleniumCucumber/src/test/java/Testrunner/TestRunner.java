package Testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Arti Mehtani//Documents//workspace//SeleniumCucumber//Features//OrangeHRM.feature",
        glue = "Stepdefinition"
)


public class TestRunner {
}
