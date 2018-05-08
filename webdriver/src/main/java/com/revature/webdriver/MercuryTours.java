package com.revature.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours{
    static WebDriver d;
    public static void main(String[] args) {
        openApp();
        login();
        findFlight();
        //logout();
    }

    static void openApp(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        d = new ChromeDriver();
        d.get("http://newtours.demoaut.com/");
    }

    static void login(){
        d.findElement(By.name("userName")).sendKeys("yuvi1");
        d.findElement(By.name("password")).sendKeys("yuvi1");
        d.findElement(By.name("login")).click();
    }

    static void logout(){
        d.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
        d.close();
    }

    static void findFlight(){
        d.findElement(By.name("fromPort")).sendKeys("Frankfurst");
        d.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
        d.findElement(By.name("findFlights")).click();
    }
}