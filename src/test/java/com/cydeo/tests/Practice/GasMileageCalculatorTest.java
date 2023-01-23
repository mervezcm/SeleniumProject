package com.cydeo.tests.Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculatorTest {

   public WebDriver driver;


   /* @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }*/


    @Test
    public void gasMileageCalculatorTest() throws InterruptedException {
        Driver.getDriver().get("https://www.calculator.net");

        WebElement searchButton = Driver.getDriver().findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchButton.sendKeys("gas mileage" + Keys.ENTER);
        //4. Click on the “Gas Mileage Calculator” link
        BrowserUtils.sleep(2);


        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”


        WebElement title = Driver.getDriver().findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        title.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Gas Mileage Calculator";

        Assert.assertEquals(actualTitle, expectedTitle);
        //b. “Gas Mileage Calculator” label is displayed

        WebElement isDisplay = Driver.getDriver().findElement(By.xpath("//h1"));
        isDisplay.isDisplayed();
        //6. Locate, clear and type “7925” into “Current odometer” field
//
       // Actions actions=new Actions(driver);
        WebElement currentOdometer = Driver.getDriver().findElement(By.xpath("//input[@id='mucodreading']"));
        /*actions.click(currentOdometer).sendKeys(Keys.COMMAND,"a").sendKeys("7925").
                sendKeys(Keys.TAB).sendKeys(Keys.COMMAND,"a").sendKeys("7550").*/

        currentOdometer.clear();
        currentOdometer.sendKeys("7925");
        //7. Locate, clear and type “7550” into “Previous odometer” field
        Thread.sleep(2);
        WebElement previousOdometer = Driver.getDriver().findElement(By.xpath("//input[@id='mupodreading']"));
        previousOdometer.clear();
       previousOdometer.sendKeys("7550");
        //8. Locate, clear and type “16” into “Gas added” field
        Thread.sleep(2);
        WebElement gasAdded = Driver.getDriver().findElement(By.xpath("//input[@id='mugasputin']"));
      //  gasAdded.clear();
        gasAdded.sendKeys("16");
        //9. Locate, clear and type “3.55” into “Gas price” field
        Thread.sleep(2);
        WebElement gasPrice = Driver.getDriver().findElement(By.xpath("//input[@id='mugasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");
        //10. Click on Calculate button
        WebElement calculateButton= Driver.getDriver().findElement(By.xpath("(//input[@value='Calculate'])[2]"));
        calculateButton.click();

        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        WebElement span= Driver.getDriver().findElement(By.xpath("//span[@class='bigtext']"));
        String actualResult= span.getText();
        String expectedResult="23.44 mpg";
        Assert.assertEquals(actualResult,expectedResult);



    }
}
