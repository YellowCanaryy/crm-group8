package com.nextbasecrm.tests;

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

public class US12_Announcement {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

    }

    @Test

    public void makeAnnouncement(){

        //Log in with valid credentials
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //Click More button
        WebElement moreButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreButton.click();

        //Click Announcement button
        WebElement announcementButton = driver.findElement(By.xpath("(//span[.='Announcement'])[1]"));
        announcementButton.click();


        //Switch to Iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        // Write message
        String message = "Hello B26!";
        driver.findElement(By.xpath("//body")).sendKeys(Keys.CLEAR + message);

        driver.switchTo().defaultContent();

        //Click Send button

        WebElement sendButton = driver.findElement(By.xpath("(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]"));
        sendButton.click();

    }


    @Test
    public void makeAnnouncementWithoutMessage()  {

        //Log in with valid credentials
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //Click More button
        WebElement moreButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreButton.click();

        //Click Announcement button
        WebElement announcementButton = driver.findElement(By.xpath("(//span[.='Announcement'])[1]"));
        announcementButton.click();


        //Switch to Iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        // Write message
        String message = "";
        driver.findElement(By.xpath("//body")).sendKeys(Keys.CLEAR + message);

        driver.switchTo().defaultContent();

        //Click Send button

        WebElement sendButton = driver.findElement(By.xpath("(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]"));
        sendButton.click();

        String actualWorkingMessage = driver.findElement(By.xpath("//span[.='The message title is not specified']")).getText();
        String expectedWorkingMessage = "The message title is not specified";
        Assert.assertEquals(actualWorkingMessage, expectedWorkingMessage);

    }
    @AfterMethod
    public void close() {
        driver.close();
    }


}

