package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element;

    public static WebElement user(WebDriver wd) {
        element = wd.findElement(By.name("username"));
        return element;
    }
}