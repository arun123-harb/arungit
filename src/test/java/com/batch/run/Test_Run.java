package com.batch.run;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//batch//feature",glue="com.batch.stepdefinition")
public class Test_Run {

}

