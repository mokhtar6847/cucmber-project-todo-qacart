package com.qacart.todo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    private static WebDriver driver;

    public WebDriver initDriver(){
        String browser = System.getProperty("browser", "CHROME");
        switch(browser){
            case "CHROME" -> {
                driver = new ChromeDriver();
            }
            case "FIREFOX" -> {
                driver = new FirefoxDriver();
            }
            default -> {
                throw new RuntimeException("Browser is not supported");
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
