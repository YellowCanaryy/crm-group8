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

public class US2_RememberMeLabel_Checkbox {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }
    @Test
    public void rememberLabel(){
        WebElement userRememberLabel = driver.findElement(By.xpath("//label[@for='USER_REMEMBER']"));
        userRememberLabel.isDisplayed();
//. “Remember me on this computer” should be displayed on the left side of the checkbox label.
        String expectedLabel="Remember me on this computer";
        String actualLabel=userRememberLabel.getText();
        Assert.assertEquals(actualLabel,expectedLabel);
    }
    @Test
    public void checkBox(){
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("checkBox.isDisplayed() = " + checkBox.isDisplayed());
        System.out.println("checkBox Before Click = " + checkBox.isSelected());
        checkBox.click();
        System.out.println("checkBox After Click = " + checkBox.isSelected());

        Assert.assertTrue(checkBox.isDisplayed());
        Assert.assertTrue(checkBox.isEnabled());
        Assert.assertTrue(checkBox.isSelected());
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
