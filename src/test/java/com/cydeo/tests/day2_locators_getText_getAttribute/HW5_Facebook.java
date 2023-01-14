package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW5_Facebook {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”
        WebElement logIn = driver.findElement(By.id("email"));
        logIn.sendKeys("ozcam123123@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456");
        WebElement signIn = driver.findElement(By.name("login"));
        signIn.sendKeys(Keys.ENTER);
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Enter incorrect username
        //4. Enter incorrect password
        //5. Verify title changed to:
        //Expected: “Log into Facebook”
        //• Create new class for each task.
        //• There are some tips in the 2nd page for whoever needs it.
        //• Please try to solve yourself first before moving to the tips
        //
    }
}
