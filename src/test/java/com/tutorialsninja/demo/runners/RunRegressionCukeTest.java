package com.tutorialsninja.demo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",    // content path of features folder
        glue =  "com/tutorialsninja/demo/steps",       // sources path from steps folder
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
       // tags = "@regression and not @smoke"

)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
