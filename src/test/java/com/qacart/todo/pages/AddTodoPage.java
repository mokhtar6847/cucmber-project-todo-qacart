package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTodoPage extends BasePage {

    public AddTodoPage(WebDriver driver) {
        super(driver);
    }

    private By newTodoInput = By.cssSelector("[data-testid=new-todo]");
    private By todoSubmit = By.cssSelector("[data-testid=submit-newTask]");



}
