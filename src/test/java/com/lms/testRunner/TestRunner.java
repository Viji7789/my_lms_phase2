package com.lms.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html"}, // reporting purpose
		monochrome=true, //console output,
				features="src\\test\\resources\\Features",
		glue={"com.lms.stepDefinitions", "com.lms.AppHooks"},
		dryRun=false
		) // location of step definition files
		
		
public class TestRunner {
}