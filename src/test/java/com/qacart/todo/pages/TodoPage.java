package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends BasePage {
    public TodoPage(WebDriver driver) {
        super(driver);
    }

    private final By welcomeMessage = By.cssSelector("[data-testid=welcome]");

    private final By plusButton = By.cssSelector("[data-testid=add]");

    private By TodoItem = By.cssSelector("[data-testid=todo-item]");

    public boolean isWelcomeMessageDisplayed(){
        return driver.findElement(welcomeMessage).isDisplayed();
    }

    public void plusButtonClick(){
        driver.findElement(plusButton).click();
    }

    public String getLastTodoText(){
        return driver.findElements(TodoItem).get(0).getText();
    }

}
