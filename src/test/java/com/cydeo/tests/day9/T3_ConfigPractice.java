package com.cydeo.tests.day9;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_ConfigPractice extends TestBase {

    @Test
    public void google_search_test_properties() {

        //2- Go to: https://google.com/
        //driver.get("https://google.com/");
        driver.get(ConfigurationReader.getProperty("url"));

        //3- Write “apple” in search box
        WebElement inputSearch = driver.findElement(By.name("q"));
        inputSearch.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

        //4- Verify title: apple - Google Search
        BrowserUtils.verifyTitle(driver, ConfigurationReader.getProperty("search.keyword") + " - Google Search");

    }
}