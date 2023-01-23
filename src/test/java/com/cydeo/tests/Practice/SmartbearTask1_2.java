package com.cydeo.tests.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearTask1_2 {
    public static void main(String[] args) {
        //
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3. Enter username: “Tester”
        //4. Enter password: “test”
        //5. Click to Login button
        WebElement username= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password= driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
    password.sendKeys("test");
    //ctl00$MainContent$login_button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        //6. Print out count of all the links on landing page
        //7. Print out each link text on this page
       /* List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));

        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));
        }*/

        List<WebElement> name=driver.findElements(By.xpath("//table//tbody//tr[1]//td[2]"));
        List<WebElement> product=driver.findElements(By.xpath("//table//tbody//tr[2]//td[3]"));
        for (int i = 0; i <8 ; i++) {
            System.out.println(name.get(i)+ ": "+product.get(i));

        }
        }
    }

