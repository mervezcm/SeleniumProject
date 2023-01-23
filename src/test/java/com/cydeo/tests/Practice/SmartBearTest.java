package com.cydeo.tests.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearTest {
WebDriver driver;
    @BeforeMethod
    public  void setup(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");



    }
    @Test
    public  void smartBear(){
        SmartBearMethod.loginToSmartBear(driver);
    }
}
