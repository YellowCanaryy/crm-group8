package com.nextbasecrm.tests.NextBaseCrm;

import com.nextbasecrm.tests.utilities.BrowserUtils;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Correct_Module {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

    }


    @Test
    public void ActivityStream_Portal() {

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();


        WebElement modules = driver.findElement(By.xpath("//a[@title='Activity Stream']"));
        modules.click();

        BrowserUtils.verifyTitle(driver,"(1) Portal");

    }

    @Test
    public void Task_Site_Map() {

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();


        WebElement Task = driver.findElement(By.xpath("//a[@title='Tasks']"));
        Task.click();
        BrowserUtils.verifyTitle(driver, "Site map");

    }

    @Test
    public void ChatAndCalls() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("marketing22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();


        WebElement ChatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        ChatAndCalls.click();


        BrowserUtils.verifyTitle(driver, "Chat and Calls");

    }

    @Test
    public void Workgroups() {

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr23@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.sleep(3);

        WebElement Workgroups = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        Workgroups.click();

        BrowserUtils.verifyTitle(driver, "Workgroups and projects");


    }

    @Test
    public void Drive() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk23@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Drive = driver.findElement(By.xpath("//a[@title='Drive']"));
        Drive.click();

        BrowserUtils.verifyTitle(driver, "Site map");


    }

    @Test
    public void Calendar() {

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("marketing23@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Calendar = driver.findElement(By.xpath("//a[@title='Calendar']"));
        Calendar.click();

        BrowserUtils.verifyTitle(driver, "Site map");


    }

    @Test
    public void Mail() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr24@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Mail = driver.findElement(By.xpath("//a[@title='Mail']"));
        Mail.click();

        BrowserUtils.verifyTitle(driver, "(2) Mailbox Integration");

    }

    @Test
    public void Contact_Center() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk24@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement ContactCenter = driver.findElement(By.xpath("//a[@title='Contact Center']"));
        ContactCenter.click();

        BrowserUtils.verifyTitle(driver, "Contact Center");
    }

    @Test
    public void TimeAnd_Reports() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("marketing24@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement TimeAndReports = driver.findElement(By.xpath("//a[@title='Time and Reports']"));
        TimeAndReports.click();

        BrowserUtils.verifyTitle(driver, "Absence Chart");
    }

    @Test
    public void Employees() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("hr22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Employees = driver.findElement(By.xpath("//a[@title='Employees']"));
        Employees.click();

        BrowserUtils.verifyTitle(driver, "(1) Company Structure");
    }

    @Test
    public void Services() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Services = driver.findElement(By.xpath("//a[@title='Services']"));
        Services.click();

        BrowserUtils.verifyTitle(driver, "Meeting Rooms");
    }

    @Test
    public void Company() {
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("marketing22@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        rememberCheckBox.click();

        WebElement actual = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        actual.isDisplayed();

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        WebElement Company = driver.findElement(By.xpath("//a[@title='Company']"));
        Company.click();

        BrowserUtils.verifyTitle(driver, "Company");
    }

}

