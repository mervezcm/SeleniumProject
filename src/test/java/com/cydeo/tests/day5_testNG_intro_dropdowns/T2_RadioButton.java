package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        WebElement hockeyRadioButton= driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(2000);
        hockeyRadioButton.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        if(hockeyRadioButton.isSelected()){
            System.out.println("Button is Selected.Verification PASSED!");
        }else{
            System.out.println("Button is not selected.Verification FAİLED!");
        }


    }
}
