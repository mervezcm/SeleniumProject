package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 - Setup the browser driver
        WebDriverManager.chromedriver().setup();



        //2 -Create instance of the Selenium Webdriver
        //This is the line opening an empty browser
        WebDriver driver=new ChromeDriver();

        // 3- Go to given the url
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use navigate().to();
        driver.navigate().to("https://www.google.com");

        // Get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current URL using Selenium
        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // To close the currently openede window
        driver.close();

        // To close ALL of the opened windows
        driver.quit();



    }
}
