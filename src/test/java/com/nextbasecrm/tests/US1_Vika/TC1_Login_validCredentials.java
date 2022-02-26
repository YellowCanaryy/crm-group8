package com.nextbasecrm.tests.US1_Vika;

import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_Login_validCredentials {

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
    public void validCredentialsLogIn(){

        //locate and verify "Authorization" title
        WebElement titleAuthorization = driver.findElement(By.xpath("//div[@class='log-popup-header']"));
        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Invalid title");

        //Enter valid user name and password
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("hr22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}









