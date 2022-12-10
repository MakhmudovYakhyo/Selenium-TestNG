package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class CydeoTitleVerification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to "https://cydeo.com"
        driver.get("https://cydeo.com");

        //3. Verify title, Expected:Cydeo
        String title = driver.getTitle();

        System.out.println(Objects.equals(title, "Cydeo"));

        driver.close();
    }
}
