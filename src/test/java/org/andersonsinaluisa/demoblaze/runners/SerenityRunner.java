package org.andersonsinaluisa.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.andersonsinaluisa.demoblaze.stepdefinitions",
        tags="",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public final class SerenityRunner {

}
