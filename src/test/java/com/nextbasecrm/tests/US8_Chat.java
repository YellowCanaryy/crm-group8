package com.nextbasecrm.tests;

import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US8_Chat {

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

    public void clickChatCallsModule(){

        //Log in with valid credentials
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //Click the Chat and Calls module
        WebElement chatAndCallsModule = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        chatAndCallsModule.click();

        //Message -Notifications-Settings-Active Stream is displayed or not?

        WebElement message = driver.findElement(By.xpath("//div[@class = 'bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        Assert.assertTrue(message.isDisplayed());

        WebElement notifications = driver.findElement(By.xpath("//div[@class = 'bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notifications.isDisplayed());

        WebElement settings = driver.findElement(By.xpath("//div[@class = 'bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settings.isDisplayed());

        WebElement activeStream = driver.findElement(By.xpath("//div[@class = 'bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activeStream.isDisplayed());



    }

    @AfterMethod
    public void close() {
        driver.close();
    }


}
