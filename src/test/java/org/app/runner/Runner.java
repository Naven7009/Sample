package org.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Navenraj\\eclipse-workspace\\Demo_qa_map\\src\\test\\java\\org\\app\\feature",
				 glue="org.app.stepdefinition",
				 dryRun=false)
				 
public class Runner {

}
