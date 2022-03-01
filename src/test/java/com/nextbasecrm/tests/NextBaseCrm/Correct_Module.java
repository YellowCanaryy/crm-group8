package com.nextbasecrm.tests.NextBaseCrm;

import com.nextbasecrm.tests.utilities.BrowserUtils;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

        String expectedTitle = "(3) Portal";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

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

        String tasksExpectedTitle = "Site map";
        String tasksActualTitle = driver.getTitle();
        Assert.assertEquals(tasksActualTitle, tasksExpectedTitle);

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


        String chatExpectedTitle = "Chat and Calls";
        String chatActualTitle = driver.getTitle();
        Assert.assertEquals(chatActualTitle, chatExpectedTitle);

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


        WebElement Workgroups = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        Workgroups.click();

        String workExpectedTitle = "Workgroups and projects";
        String workActualTitle = driver.getTitle();
        Assert.assertEquals(workActualTitle, workExpectedTitle);


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

        String driveExpectedTitle = "Site map";
        String driveActualTitle = driver.getTitle();
        Assert.assertEquals(driveActualTitle, driveExpectedTitle);


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

        String calendarExpectedTitle = "Site map";
        String calendarActualTitle = driver.getTitle();
        Assert.assertEquals(calendarActualTitle, calendarExpectedTitle);


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

        String MailExpectedTitle = "(2) Mailbox Integration";
        String MailActualTitle = driver.getTitle();
        Assert.assertEquals(MailActualTitle,MailExpectedTitle);

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

        String contactCenterExpectedTitle = "Contact Center";
        String contactCenterActualTitle = driver.getTitle();
        Assert.assertEquals(contactCenterActualTitle, contactCenterExpectedTitle);
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

        String timeAndReportsExpectedTitle = "Absence Chart";
        String timeAndReportsActualTitle = driver.getTitle();
        Assert.assertEquals(timeAndReportsActualTitle, timeAndReportsExpectedTitle);
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

        String EmployeesExpectedTitle = "(3) Company Structure";
        String EmployeesActualTitle = driver.getTitle();
        Assert.assertEquals(EmployeesActualTitle, EmployeesExpectedTitle);
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

        String ServicesExpectedTitle = "Meeting Rooms";
        String ServicesActualTitle = driver.getTitle();
        Assert.assertEquals(ServicesActualTitle, ServicesExpectedTitle);
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

        String CompanyExpectedTitle = "Company";
        String CompanyActualTitle = driver.getTitle();
        Assert.assertEquals(CompanyActualTitle, CompanyExpectedTitle);
    }

    @AfterMethod
    public void tearDownMethod(){

        driver.close();
    }

}
