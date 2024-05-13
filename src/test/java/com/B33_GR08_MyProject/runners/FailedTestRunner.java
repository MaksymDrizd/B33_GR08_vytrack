package com.B33_GR08_MyProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/B33_GR08_MyProject/step_definitions"
)
public class FailedTestRunner {
}


