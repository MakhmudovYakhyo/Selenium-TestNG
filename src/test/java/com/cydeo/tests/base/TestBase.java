package com.cydeo.tests.base;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

// This class is the parent of all Test classes
// You will update this class based on what you are keep writing in your most test classes
// instead writing in all test classes, you can just write in this class, and you can extend this class from any class
public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. Setup browser
        driver = Driver.getDriver();
        /*driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        driver.get("http://www.facebook.com/");
    }

    @AfterMethod
    public void tearDownMethod() {
        //  Close driver
        //driver.close();
        Driver.closeDriver();
    }
}
