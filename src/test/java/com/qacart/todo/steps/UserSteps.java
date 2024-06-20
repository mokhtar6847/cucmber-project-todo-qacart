package com.qacart.todo.steps;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class UserSteps {
    WebDriver driver;
    LoginPage object;

    @Given("User is at the login page")
    public void isUserAtTheLoginPage(){
        driver = new DriverFactory().getDriver();
        object = new LoginPage(driver);
        object.load("https://todo.qacart.com/");
    }

    @When("User fills the email and password and login")
    public void UserFillsEmailAndPassword() {
        object.login("mokhtarmetehri@yahoo.fr", "mokhtar93");
    }

    @Then("Welcome message should be displayed")
    public void IsWelcomeMessageDisplayed(){
        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=welcome]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);

    }
}
