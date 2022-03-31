package com.amazonRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
	
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, 
			features = {"src/test/resources/Features" }, 
			glue = { "com.amazonStepDefinition" }, 
			tags = { "@chrome", }, monochrome = true)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

@BeforeTest
public void beforeTest() {
	System.out.println("... Test STarted ...");
}

@AfterTest
public void afterTest() {
	System.out.println("... Test Completed ...");
}
}

}
