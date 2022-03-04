package com.nextbasecrm.tests;

import com.nextbasecrm.tests.utilities.BrowserUtils;
import com.nextbasecrm.tests.utilities.ConfigurationReader;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.apache.hc.core5.http.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US6_TC_MoreTab {
    //1TC for login
    /**
     * 1-go to login page
     * 2-write username
     * 3-write password
     * 4-click login button
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  1-go to login page
        driver.get(ConfigurationReader.getProperty("env"));
    }

  /*
  @AfterMethod

    public void tearDown() {
        BrowserUtils.sleep(3);
        driver.close();
        }
   */


    //positive scnerio
    @Test
    public void login_with_valid_credentials_with_login_btn() {
        // 2-write username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        //     * 3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        //     * 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.sleep(3);
        loginBtn.click();
        // 5 verify title
        //String expectedTitle = "Portal";
        // String actualTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    //2-Click on More Tab
    public void more_tab() throws InterruptedException {
        WebElement moreBtn = driver.findElement(By.xpath("//span[@class='menu-popup-item-text']"));
        moreBtn.click();

        //3-Able to see 4 Options
        //File, Appreciation,Announcement and Workflow
        List<WebElement> fourOptions = driver.findElements(By.xpath("//span[@class='menu-popup-item-text'][1]"));

        for (WebElement each : fourOptions) {
            Assert.assertTrue(each.isDisplayed());


        }






    }
}



    //4-Scenarios: Verify users( HR,marketing,Helpdesk) access more tabs










