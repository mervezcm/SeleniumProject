package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to the url
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);
       // 3- Click to A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click(); //<a href="/abtest">A/B Testing</a>
        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        // Actual title comes from browser
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
        // 5- Go back to home page by using the .back();
        driver.navigate().back();
       // 6- Verify title equals:
        //Expected: Practice
        //4. Verify title:
        // Expected: Cydeo
        String expectedTitle2 = "Practice";
        // Actual title comes from browser
        actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle2)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
        driver.close();





    }
}
