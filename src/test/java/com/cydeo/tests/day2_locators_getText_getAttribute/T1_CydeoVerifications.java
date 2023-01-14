package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
         */
        // 1 Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to the url
        driver.get("https://www.cydeo.com");
        //3.Verify URL:
        //Expected: cydeo
        String expectedURL = "https://cydeo.com/";

        // Actual title comes from browser
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (actualURL.contains(expectedURL)) {
            System.out.println(" URL Verification Passed!");
        } else {
            System.out.println(" URL Verification Failed!");
        }
        //4. Verify title:
        // Expected: Cydeo
        String expectedTitle = "Cydeo";
        // Actual title comes from browser
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
        driver.close();


    }
}
