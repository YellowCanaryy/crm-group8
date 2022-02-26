package com.nextbasecrm.tests.US1_Vika;

import com.nextbasecrm.tests.utilities.WebDriverFactory;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3_RememberMe_checkbox {


    WebDriver driver;
    @BeforeMethod
    public void SetUpMethod() {
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void rememberMeCheckbox(){

        WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberMeCheckbox.click();

        WebElement rememberMeMessage = driver.findElement(By.xpath("//div[@class='login-text login-item']"));
        String expectedMessage = "Remember me on this computer";
        String actualMessage = rememberMeMessage.getText();

        Assert.assertEquals(actualMessage, expectedMessage, "invalid message");


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }



}