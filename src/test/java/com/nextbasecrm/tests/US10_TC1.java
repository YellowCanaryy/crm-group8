package com.nextbasecrm.tests;

import com.nextbasecrm.tests.utilities.ConfigurationReader;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US10_TC1 {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        //Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env"));

        //UserName input
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));

        //Password input
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();
    }

    @Test
    public void taskCreationConfirmationMessage() throws InterruptedException {
        //Locate "TASK" tab and click
       driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']//span")).click();

       //Locate titlePanel and input title message
       WebElement titleMessage = driver.findElement(By.xpath("//input[@placeholder='Things to do']"));
       titleMessage.sendKeys("Reminder");

       //Locate message body and input message
       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']/iframe")));
       WebElement messageBody = driver.findElement(By.xpath("//body"));
       Thread.sleep(1000);
       messageBody.sendKeys("Please, finish your TC");

       driver.switchTo().defaultContent();

       //Locate "SEND" button and click it
       WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
       sendButton.click();

       //Locate message creation confirmation and compare actual one with expected
       WebElement taskCreationConfirmationMessage = driver.findElement(By.xpath("(//span[@class='feed-task-info-text-title'])[1]"));
       String expectedMessage = "Task has been created";
       String actualMessage = taskCreationConfirmationMessage.getText();

        Assert.assertEquals(actualMessage, expectedMessage, "Messages do not match");


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
