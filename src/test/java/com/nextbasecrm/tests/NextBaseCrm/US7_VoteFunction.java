package com.nextbasecrm.tests.NextBaseCrm;

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

public class US7_VoteFunction {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String appUrl = "https://login1.nextbasecrm.com/";
        String userName = "hr28@cybertekschool.com";
        String password = "UserUser";
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appUrl);

        driver.findElement(By.xpath("//input[@class='login-inp']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();
    }
    @Test
    public void voteForPoll() throws InterruptedException {
        WebElement pollBtn=driver.findElement(By.xpath("//span[text()='Poll']"));
        pollBtn.click();
        driver.switchTo().frame (driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("please vote!");
        driver.switchTo().defaultContent();

       driver.findElement(By.xpath("//div[@class='vote-block-title-wrap']/input[1]")).sendKeys("What is your favourite type of cuisines");
       driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap']/input[1]")).sendKeys("Japanese food");
       driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][2]/input[1]")).sendKeys("Italian food");
       driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][3]/input[1]")).sendKeys("Mediterranean Cuisine");
       driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][4]/input")).sendKeys("Turkish Cuisine");
      //  WebElement checkbox=driver.findElement(By.xpath("//input[@id='multi_0']"));
      //  checkbox.click();
        WebElement sendBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"question52\"]/table/tbody/tr[1]/td[1]/div/span/label[1]/span")).click();
        driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-primary']")).click();


    }
    @AfterMethod
    public void teardown(){
   // driver.close();
    }

}



