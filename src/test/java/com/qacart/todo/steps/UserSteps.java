package com.qacart.todo.steps;

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


    @Given("User is at the login page")
    public void isUserAtTheLoginPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com/");
    }

    @When("User fills the email and password and login")
    public void UserFillsEmailAndPassword() {
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("mokhtarmetehri@yahoo.fr");
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys("mokhtar93");
        driver.findElement(By.cssSelector("[data-testid=submit]")).click();
    }

    @Then("Welcome message should be displayed")
    public void IsWelcomeMessageDisplayed(){
        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=welcome]")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
        driver.quit();

    }
}
