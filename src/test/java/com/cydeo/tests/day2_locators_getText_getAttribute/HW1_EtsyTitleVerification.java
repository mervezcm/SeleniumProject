package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTitleVerification {
    public static void main(String[] args) {
        /*
    TC #1: Etsy Title Verification
1. Open Chrome browser*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
//3. Search for “wooden spoon”  search_query
        WebElement searchTest= driver.findElement(By.name("search_query"));
        searchTest.sendKeys("wooden spoon"+ Keys.ENTER);

//4. Verify title:
//Expected: “Wooden spoon | Etsy”
       String actualResult= driver.getTitle();
       String expectedResult="Wooden spoon | Etsy";
        System.out.println(actualResult);
       if (actualResult.equals(expectedResult)){
           System.out.println("Test ıs passed");
       }else {
           System.out.println( "Test is failed");
       }
       driver.close();

    }
}
