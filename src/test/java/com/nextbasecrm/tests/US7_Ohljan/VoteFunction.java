package com.nextbasecrm.tests.US7_Ohljan;

import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VoteFunction {
    WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            String appUrl = "https://login.nextbasecrm.com/stream/?login=yes";
            String userName = "hr28@cybertekschool.com";
            String password = "UserUser";
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(appUrl);
          //  WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
          //  loginBtn.click();
            driver.findElement(By.xpath("//input[@class='login-inp']")).sendKeys(userName);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            WebElement loginBtn1 = driver.findElement(By.xpath("//input[@value='Log In']"));
            loginBtn1.click();
        }
        @Test
        public void voteForPoll(){
            WebElement pollBtn=driver.findElement(By.xpath("//span[text()='Poll']"));
            pollBtn.click();
            WebElement title= driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
                title.sendKeys("your favourite types of cuisines");
            WebElement question=driver.findElement(By.xpath("//div[@class='vote-block-title-wrap']/input[1]"));
            question.sendKeys("What is your favourite type of cuisines");
            WebElement answer1=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap']/input[1]"));
            answer1.sendKeys("Japanese food");
            WebElement answer2=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][2]/input[1]"));
            answer2.sendKeys("Italian food");
            WebElement answer3=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][3]/input[1]"));
            answer3.sendKeys("Mediterranean Cuisine");
            WebElement answer4=driver.findElement(By.xpath("//li[@class='vote-block-inp-wrap'][4]/input"));
            answer4.sendKeys("Turkish Cuisine");
            WebElement checkbox=driver.findElement(By.xpath("//input[@id='multi_0']"));
            checkbox.click();
            driver.switchTo().defaultContent();
            WebElement sendBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']  "));
            sendBtn.click();

            WebElement option1=driver.findElement(By.xpath("//table[@class='bx-vote-answer-list']//span[@class='bx-vote-block-inp-substitute']"));
            WebElement option2=driver.findElement(By.xpath("//table[@class='bx-vote-answer-list']//tr[2]//span[@class='bx-vote-block-inp-substitute']"));
            WebElement option3=driver.findElement(By.xpath("//table[@class='bx-vote-answer-list']//tr[3]//span[@class='bx-vote-block-inp-substitute']"));
            WebElement option4=driver.findElement(By.xpath("//table[@class='bx-vote-answer-list']//tr[4]//span[@class='bx-vote-block-inp-substitute']"));
            WebElement voteBtn=driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-primary']"));
            Assert.assertTrue(option1.isSelected());
            Assert.assertTrue(option2.isSelected());
            Assert.assertTrue(option3.isSelected());
            Assert.assertTrue(option4.isSelected());
            voteBtn.click();

        }
    @AfterMethod
    public void teardown(){
            driver.close();
    }

    }



