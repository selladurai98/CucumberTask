package com.flipcart.stepdefinition;

import org.junit.runner.RunWith;

import com.flipcart.resources.Commonactions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   
@CucumberOptions(features = "src//test//Features//)",
                     glue = "com.flipcart.stepdefinition",
                   plugin ="html:target",
               monochrome = true,
                   dryRun = false)



public class TestRunner extends Commonactions {
	
	
    
}
