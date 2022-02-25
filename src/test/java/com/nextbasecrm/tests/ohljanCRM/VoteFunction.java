package com.nextbasecrm.tests.ohljanCRM;

import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VoteFunction {
    WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            String appUrl = "https://nextbasecrm.com/";
            String userName = "hr28@cybertekschool.com";
            String password = "UserUser";
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(appUrl);
            WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
            loginBtn.click();
            driver.findElement(By.xpath("//input[@class='login-inp']")).sendKeys(userName);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            WebElement loginBtn1 = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginBtn1.click();
        }
        @Test
        public void voteForPoll(){
            WebElement pollBtn=driver.findElement(By.xpath("//span[text()='Poll']"));
            pollBtn.click();
            WebElement question=driver.findElement(By.xpath("//div[@class='vote-block-title-wrap']/input[1]"));
            WebElement answer1=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap']/input[1]"));
            WebElement answer2=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][2]/input[1]"));
            WebElement answer3=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][3]/input[1]"));
            WebElement answer4=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][4]/input"));
            WebElement checkbox=driver.findElement(By.xpath("driver.findElement(By.xpath"));
            checkbox.click();
            WebElement sendBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']  "));
            sendBtn.click();

        }
    }


