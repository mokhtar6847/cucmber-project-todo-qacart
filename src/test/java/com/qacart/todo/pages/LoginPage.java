package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By emailInput = By.cssSelector("[data-testid=email]");
    private By passwordInput = By.cssSelector("[data-testid=password]");
    private By submitButton = By.cssSelector("[data-testid=submit]");

}
