package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightFinder{
    public static WebElement element;

    public static WebElement departingFrom(WebDriver wd){
        element = wd.findElement(By.name("fromPort"));
        return element;
    }
}