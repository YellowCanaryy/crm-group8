package com.nextbasecrm.tests;

import com.nextbasecrm.tests.utilities.BrowserUtils;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US1 {

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

        //Enter valid user name
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("hr22@cydeo.com");

        //Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();

        //verify actual title
        String expectedLogInBtn = "Portal";
        String actualLoginTitle = driver.getTitle();
        Assert.assertEquals(actualLoginTitle, expectedLogInBtn);

    }

    @Test
    public void invalidCredentialsLogIn(){

        //Enter invalid username and password
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("hr22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("User");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.sleep(3);
        logInBtn.click();

        //Verify incorrect login message
        WebElement incorrectLoginMessage = driver.findElement(By.xpath("//div[@class='errortext']"));
        String expectedMessage = "Incorrect login or password";
        String actualMessage = incorrectLoginMessage.getText();

        Assert.assertEquals(actualMessage, expectedMessage, "invalid message");

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
        BrowserUtils.sleep(3);
        driver.close();
    }

}









