package com.cydeo.tests.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Amazon {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void amazon_test() {
        driver.get("https://www.amazon.com/");
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("nutella"+ Keys.ENTER);

        WebElement sortBtn=driver.findElement(By.xpath("//span[.='Featured']"));
        sortBtn.click();

        WebElement lowToHigh=driver.findElement(By.xpath(" //a[contains(text(),'Price: Low to High')]"));
        lowToHigh.click();

        WebElement nutella_Bready=driver.findElement(By.xpath("//span[contains(text(),'Nutella B-ready (44g (Pack of 3)')]"));
        nutella_Bready.click();

        WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCart.click();

        WebElement lastCart=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']"));
        lastCart.click();

        Select quantity = new Select(driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative sc-update-quantity-select']")));
        quantity.selectByValue("4");

        WebElement checkout = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
        checkout.click();

    }

}