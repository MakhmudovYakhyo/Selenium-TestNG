package com.cydeo.tests.day9;

import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {
    @Test
    public void crm_login_test1() {
//      2. Go to : http://login1.nextbasecrm.com/


//      3. Enter valid username: "hr2@cydeo.com"
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='email']"));
        inputUsername.sendKeys("");

//      4. Enter valid password: "UserUser"
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='pass']"));
        inputPassword.sendKeys("");

//      5. Click to Log In button //input[@class='login-btn']
        WebElement buttonLogIn = driver.findElement(By.xpath("//button[@name='login']"));
        buttonLogIn.click();

//      6. Verify title is as expected: "Portal"
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"Facebook");
    }

    @Test
    public void crm_login_test2(){
        driver.get("http://www.facebook.com/");
        CRM_Utilities.login_crm(driver);

//      6. Verify title is as expected: "Portal"
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"Facebook");
    }

    @Test
    public void crm_login_test3(){
        driver.get("http://www.facebook.com/");
        CRM_Utilities.login_crm(driver, "username","password");

//      6. Verify title is as expected: "Portal"
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver,"Facebook");
    }
}
