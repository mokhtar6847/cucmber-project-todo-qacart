package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends BasePage {
    public TodoPage(WebDriver driver) {
        super(driver);
    }

    private By welcomeMessage = By.cssSelector("[data-testid=welcome]");

    private By addButton = By.cssSelector("[data-testid=add]");


}
