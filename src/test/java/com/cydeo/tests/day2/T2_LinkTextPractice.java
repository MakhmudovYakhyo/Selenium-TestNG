package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://practice.cydeo.com/"
        driver.get("https://practice.cydeo.com/");

        // 3. Click to A/B testing from tab of the list
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();

        // 4. Verify title is: Expected: No A/B Test
        String expectedTitle = "No A/B Test";                             // comes from requirement
        String actualTitle = driver.getTitle();                           // comes from browser
        System.out.println(actualTitle.contains(expectedTitle));

        // 5. Go back to home page by using the .back()
        driver.navigate().back();

        // 6. Verify title equals: Expected: Practice
        expectedTitle = "Practice";                                // comes from requirement
        actualTitle = driver.getTitle();                           // comes from browser
        System.out.println(actualTitle.contains(expectedTitle));

        driver.close();
    }
}
