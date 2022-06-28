package com.BurgerKING.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/BurgerKING/stepDefinitions",
        dryRun = true,
        tags = "",
        publish = true

)


public class TestRunner {}



