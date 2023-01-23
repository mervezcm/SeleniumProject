package com.cydeo.tests.Practice;


import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupStudyFrames {
    public WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void amazon_test() throws InterruptedException {
        driver.get("https://www.cydeo.com/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='bewebchat']")));
        driver.findElement(By.xpath("//img[@id='chat-image']")).click();
        //returning the main html page
        driver.switchTo().parentFrame();

        //switching the new iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='window-iframe']")));


        Faker faker=new Faker();
        //locating the input box
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='webchat__name']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='webchat__name']")).sendKeys(faker.name().firstName());
        Thread.sleep(2000);
//webchat__message
        driver.findElement(By.xpath("//textarea[@id='webchat__message']")).sendKeys(faker.chuckNorris().fact());
        Thread.sleep(2000);

    }
}