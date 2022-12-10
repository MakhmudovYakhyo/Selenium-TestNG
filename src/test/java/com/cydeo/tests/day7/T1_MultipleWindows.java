package com.cydeo.tests.day7;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_MultipleWindows extends TestBase {

    /*WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Setup browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to webpage
        driver.get("https://practice.cydeo.com/windows");
    }*/


    @Test
    public void multiple_windows_test(){

        //3. Assert: Title is “Windows”
        //Assert.assertEquals(driver.getTitle(),"Windows");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        //4. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        //5. Click to: “CYDEO” link
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        cydeoLink.click();

        //6. Switch to Cydeo page
        Set<String> allWindows = driver.getWindowHandles();
        for (String each : allWindows) {
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        //7. Assert: Title is “Cydeo”
        actualTitle = driver.getTitle();
        expectedTitle = "Cydeo";
        //Assert.assertEquals(actualTitle,expectedTitle);
        BrowserUtils.verifyTitle(driver, expectedTitle);

    }


    /*@AfterMethod
    public void tearDownMethod() {
        //  Close driver
        //driver.close();
        driver.quit();
    }*/
}
