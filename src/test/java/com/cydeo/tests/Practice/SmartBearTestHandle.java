package com.cydeo.tests.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SmartBearTestHandle {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        Set<String> allPages=driver.getWindowHandles();
        for (String eachPage : allPages) {
            driver.switchTo().window(eachPage);
            System.out.println(driver.getTitle());

        }

    }
}
