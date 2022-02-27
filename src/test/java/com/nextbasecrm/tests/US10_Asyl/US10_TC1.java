package com.nextbasecrm.tests.US10_Asyl;

import com.nextbasecrm.tests.utilities.ConfigurationReader;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();
    }

    @Test
    public void taskCreationConfirmationMessage() throws InterruptedException {
       driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']//span")).click();
       WebElement titleMessage = driver.findElement(By.xpath("//input[@placeholder='Things to do']"));
        titleMessage.sendKeys("Reminder");

       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']/iframe")));
       WebElement messageBody = driver.findElement(By.xpath("//body"));
       Thread.sleep(1000);
       messageBody.sendKeys("Please, finish your TC");

        driver.switchTo().defaultContent();




    }

}
