package com.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Karen Amy\\eclipse-workspace\\AugBDDFramework\\src\\test\\java\\com\\bdd\\feature",
				glue= "com.bdd.stepdefinition",
				plugin= {"pretty","html:taget/report"},
				tags= {"@Demosite"},
				dryRun=true, // to check the unimplemented step in feature file before execution,
				monochrome=true // display the console in proper readable format
				)
public class TestRunner {

}
