package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"stepDefs"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"})

public class Runner extends AbstractTestNGCucumberTests {
}