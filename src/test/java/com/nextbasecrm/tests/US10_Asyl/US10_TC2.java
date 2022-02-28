package com.nextbasecrm.tests.US10_Asyl;

import com.nextbasecrm.tests.utilities.ConfigurationReader;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US10_TC2 {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        //Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

        //UserName input
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk22@cydeo.com");

        //Password input
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //Locate LogIn button and click it
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();
    }

    @Test
    public void titleMissingWarningMessage(){
        //Locate "TASK" tab and click it
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']//span")).click();

        //Locate Message body and input message
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']/iframe")));
        WebElement messageBody = driver.findElement(By.xpath("//body"));
        messageBody.sendKeys("Please, finish your TC");
        driver.switchTo().defaultContent();

        //Locate "SEND" button and click it
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //Locate ErrorMessage and compare
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='task-message-label error']"));
        String expectedErrorMessage = "The task name is not specified.";
        String actualErrorMessage = errorMessage.getText();

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Messages do not match");
    }
   /* @AfterMethod
    public void tearDown(){
        driver.close();
    }

    */

}
