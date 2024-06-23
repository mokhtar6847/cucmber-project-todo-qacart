package com.qacart.todo.steps;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.EnvUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class UserSteps {
    WebDriver driver;
    LoginPage object;

    @Given("User is at the login page")
    public void isUserAtTheLoginPage() throws IOException {
        driver = new DriverFactory().getDriver();
        object = new LoginPage(driver);
        object.load(EnvUtils.getInstance().getURL().toString());
    }

    @When("User fills the email and password and login")
    public void UserFillsEmailAndPassword() throws IOException {
        object.login(EnvUtils.getInstance().getEmail().toString(), EnvUtils.getInstance().getPASSWORD().toString());
    }

    @Then("Welcome message should be displayed")
    public void IsWelcomeMessageDisplayed(){
        boolean isWelcomeDisplayed = new TodoPage(driver).isWelcomeMessageDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);

    }
}
