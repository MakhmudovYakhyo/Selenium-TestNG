package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("lang=en-GB");

        if (Objects.equals(browserType, "Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        } else if (Objects.equals(browserType, "Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else {
            throw new WebDriverException("Unsupported browser type");
        }

        return driver;
    }
}