package ubs.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ubs.com"},
        features = {"src/test/resources/mainPage/features"},
        plugin = {"pretty",
                "html:target/cucumber-html",
                "junit:target/cucumber-junit/cucumber.xml",
                "json:target/cucumber-json/cucumber.json"},
        snippets = CAMELCASE)
public class Runner {
}
