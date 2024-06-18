package com.qacart.todo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TodoSteps {

    WebDriver driver;

    @Given("User is in the todo page")
    public void isUserInTodoPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com/");
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("mokhtarmetehri@yahoo.fr");
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys("mokhtar93");
        driver.findElement(By.cssSelector("[data-testid=submit]")).click();
        boolean isToDoPage = driver.findElement(By.cssSelector("[data-testid=add]")).isDisplayed();
        Assert.assertTrue(isToDoPage);


    }

    @When("User adds a new todo")
    public void AddNewTodo(){
        driver.findElement(By.cssSelector("[data-testid=add]")).click();
        driver.findElement(By.cssSelector("[data-testid=new-todo]")).sendKeys("Dish washing");
        driver.findElement(By.cssSelector("[data-testid=submit-newTask]")).click();

    }
    @Then("todo should be added correctly")
    public void TodoShouldBeAddedCorrectly(){
        String isToDoTaskDisplayed = driver.findElements(By.cssSelector("[data-testid=todo-item]")).get(0).getText();
        Assert.assertEquals("Dish washing", isToDoTaskDisplayed);
        driver.quit();

    }
}
