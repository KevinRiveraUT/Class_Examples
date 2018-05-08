package com.revature.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.google.com");
        d.findElement(By.id("lst-ib")).sendKeys("Mercury Tours");
        d.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
        // d.close();
    }
}