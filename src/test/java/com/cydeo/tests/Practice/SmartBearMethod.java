package com.cydeo.tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearMethod {
    //Mini-Task: CREATE A CLASS à SmartBearUtils
    //• Create a method called loginToSmartBear
    //• This method simply logs in to SmartBear when you call it.
    //• Accepts WebDriver type as parameter
    //
    public static void loginToSmartBear(WebDriver driver) {
        WebElement username = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }
}