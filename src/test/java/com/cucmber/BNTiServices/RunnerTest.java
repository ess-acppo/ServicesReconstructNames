package com.cucmber.BNTiServices;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features= {	"classpath:SmokeTest.feature",
				},
		plugin = {
		        "pretty:target/cucumber-html-report", 
		        "html:target/cucumber-htmlreport",
		        "json:target/cucumber.json",
		        "junit:target/cucumber-results.xml"
		 },
		tags = { "~@ignore" }
		
		) 
public class RunnerTest {

}
