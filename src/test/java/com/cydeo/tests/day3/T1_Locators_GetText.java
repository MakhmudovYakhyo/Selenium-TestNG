package com.cydeo.tests.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_GetText {
    public static void main(String[] args) {

        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // 2. Go to "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");

        // 3. Enter incorrect username: "incorrect"
        WebElement loginInput = driver.findElement(By.name("USER_LOGIN"));
        loginInput.sendKeys("incorrect");

        // 4. Enter incorrect password: "incorrect"
        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        // 5. Click to Login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        // 6. Verify error message text is as expectedErrorMessage:
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();
        System.out.println(expectedErrorMessage.equals(actualErrorMessage));

        // 7. Close the driver
        driver.close();
    }
}