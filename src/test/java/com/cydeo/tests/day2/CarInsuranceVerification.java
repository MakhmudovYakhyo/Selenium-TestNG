package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceVerification {
    public static void main(String[] args) {

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://www.qa1.excelsoirinsurance.com/login"
        driver.get("https://www.qa1.excelsoirinsurance.com/login");

        // 3. Verify URL contain Expected: "excelsoirinsurance"
        String expectedURL = "https://www.qa1.excelsoirinsurance.com/login";  // comes from requirement
        String actualURL = driver.getCurrentUrl();                        // comes from browser
        System.out.println(actualURL.contains(expectedURL));

        // 4. Verify title: Expected "Login | Excelsoir Insurance"
        String expectedTitle = "Login | Excelsoir Insurance";             // comes from requirement
        String actualTitle = driver.getTitle();                           // comes from browser
        System.out.println(actualTitle.contains(expectedTitle));

        driver.close();
    }
}
