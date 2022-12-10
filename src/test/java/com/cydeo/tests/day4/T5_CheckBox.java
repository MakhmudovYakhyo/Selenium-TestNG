package com.cydeo.tests.day4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_CheckBox {
    public static void main(String[] args) {

        // 1. Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // 2. Go to "https://practice.cydeo.com/checkboxes"
        driver.get("https://practice.cydeo.com/checkboxes");

        // 3. Confirm checkbox #1 is not selected by default
        WebElement box1 = driver.findElement(By.id("box1"));
        System.out.println("box1.isSelected(), expected: False = " + box1.isSelected());

        // 4. Confirm checkbox #2 is selected by default
        WebElement box2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("box2.isSelected(), expected: True = " + box2.isSelected());

        // 5. Click checkbox #1 to select it
        box1.click();

        // 6. Click checkbox #2 to deselect it
        box2.click();

        // 7. Confirm checkbox #1 is selected
        System.out.println("box1.isSelected(), expected: True = " + box1.isSelected());

        // 8. Confirm checkbox #2 is not selected
        System.out.println("box2.isSelected(), expected: False = " + box2.isSelected());

        // 9. close the driver
        driver.close();
    }
}
