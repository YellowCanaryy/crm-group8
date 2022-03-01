package com.nextbasecrm.tests.US13;

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

public class US13 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com/stream/?login=yes");

    }

    @Test
    public void makeAppreciation() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click More button
        driver.findElement(By.xpath("//span[.='More']")).click();
        //click Appreciation
        driver.findElement(By.xpath("//span[.='Appreciation']")).click();

        Thread.sleep(3000);
        //switch to Iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        // writing message
        String message = "I appraciate You!";
        driver.findElement(By.xpath("//body")).sendKeys(Keys.CLEAR + message);

        Thread.sleep(3000);

        driver.switchTo().defaultContent();
        //click send button
        driver.findElement(By.xpath("(//button[.='Send'])[3]")).click();
        String locator = "//div[contains(.,'" + message + "')]";
        WebElement element = driver.findElement(By.xpath(locator));
        Assert.assertTrue(element.isDisplayed());
        Thread.sleep(5000);


    }

    @Test
    public void withoutMessage() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        login.sendKeys("helpdesk22@cydeo.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click More button
        driver.findElement(By.xpath("//span[.='More']")).click();
        //click Appreciation
        driver.findElement(By.xpath("//span[.='Appreciation']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[.='Send'])[3]")).click();
        String actualTitle = driver.findElement(By.xpath("//span[.='The message title is not specified']")).getText();
        String expectedTitle = "The message title is not specified";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @AfterMethod
    public void close() {
        driver.close();
    }
}