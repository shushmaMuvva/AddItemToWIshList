package com.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber/wishList","json:target/cucumber-wishList.json" }, 
		glue = { "com.test.steps" },
	    features = "src/test/resources/stories/", 
		tags ={"@itemWishList"}
        ,monochrome=true
)

public class WishListRunnerClass {
	//This is just a runner
	
}
