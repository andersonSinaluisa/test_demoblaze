package org.andersonsinaluisa.demoblaze.runners;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.miempresa.miapp.stepdefinitions"
)
public class SerenityRunner {

}
