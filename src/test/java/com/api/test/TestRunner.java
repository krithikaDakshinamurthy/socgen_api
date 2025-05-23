package com.api.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber/report",
				"json:target/cucumber/cucumber.json",
				"com.api.utils.MyTestListener"
		},
		features= {"src\\test\\resources\\features\\petstore.feature"}
		,glue = {"com.api.stepdefinition"}
		//,dryRun = true
		,monochrome = true
//		,tags = "@pet_order"
		)
public class TestRunner {
}
