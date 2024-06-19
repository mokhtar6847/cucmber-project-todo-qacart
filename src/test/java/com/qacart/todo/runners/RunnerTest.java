package com.qacart.todo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/qacart/todo"
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
