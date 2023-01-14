package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        /*
        TC#3: Google search
//1- Open a chrome browser
WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
         */
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write “apple” in search box
       // 4- Click google search button + Keys.Enter
        WebElement googleSearchBox= driver.findElement(By.name("q"));//the locator will check name of attributes
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word
       String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);//actualTitle = apple - Google'da Ara
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }






    }
}
