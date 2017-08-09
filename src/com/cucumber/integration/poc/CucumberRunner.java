package com.cucumber.integration.poc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/com/sony/cucumber/integration/poc")

@CucumberOptions(format={"html:output"})

public class CucumberRunner {

}
