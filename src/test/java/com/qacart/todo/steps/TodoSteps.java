package com.qacart.todo.steps;

import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.AddTodoPage;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.EnvUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;


public class TodoSteps {

    WebDriver driver;

    @Given("User is in the todo page")
    public void isUserInTodoPage() throws IOException {
        driver = new DriverFactory().getDriver();
        new LoginPage(driver).load(EnvUtils.getInstance().getURL().toString());
        new LoginPage(driver).login(EnvUtils.getInstance().getEmail().toString(), EnvUtils.getInstance().getPASSWORD().toString());
    }

    @When("User adds a new todo")
    public void AddNewTodo(){
        new TodoPage(driver).plusButtonClick();
        new AddTodoPage(driver).addTodo("Learn ALLE");

    }
    @Then("todo should be added correctly")
    public void TodoShouldBeAddedCorrectly(){
        String isToDoTaskDisplayed = new TodoPage(driver).getLastTodoText();
        Assert.assertEquals("Learn ALLE", isToDoTaskDisplayed);
    }
}
