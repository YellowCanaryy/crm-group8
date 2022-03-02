package com.nextbasecrm.tests;

import com.nextbasecrm.tests.utilities.BrowserUtils;
import com.nextbasecrm.tests.utilities.CRM_Utilities;
import com.nextbasecrm.tests.utilities.ConfigurationReader;
import com.nextbasecrm.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US_9_Modules {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        String browserType = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.getProperty("env1"));

        CRM_Utilities.crm_login(driver);

    }

    @Test
    public void leftSideActivityStreamTest(){
        WebElement actStr = driver.findElement(By.xpath("//span[contains(.,'Activity Stream')]"));
        actStr.click();
        String expectedTitle="Portal";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Activity Stream Title did not appear correctly!");

    }

    @Test
    public void leftSidebarTasksTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Tasks')]"));
        tasks.click();
        String expectedTitle="Site map"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Tasks title did not appear correctly!");

    }

    @Test
    public void leftSidebarChatAndCallsTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Chat and Calls')]"));
        tasks.click();
        String expectedTitle="Chat and Calls"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Chat And Calls title did not appear correctly!");

    }

    @Test
    public void leftSidebarWorkgroupsTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Workgroups')]"));
        tasks.click();
        String expectedTitle="Workgroups and projects"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Workgroups and projects title did not appear correctly!");

    }

    @Test
    public void leftSidebarDriveTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Drive')]"));
        tasks.click();
        String expectedTitle="Site map"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Drive title did not appear correctly!");

    }

    @Test
    public void leftSidebarCalendarTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Calendar')]"));
        tasks.click();
        String expectedTitle="Site map"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Calendar title did not appear correctly!");

    }

    @Test
    public void leftSidebarMailTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Mail')]"));
        tasks.click();
        String expectedTitle="Mailbox Integration"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Mail title did not appear correctly!");

    }

    @Test
    public void leftSidebarContact_CenterTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Contact Center')]"));
        tasks.click();
        String expectedTitle="Contact Center"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Contact Center title did not appear correctly!");

    }

    @Test
    public void leftSidebarTimeAnd_ReportsTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Time and Reports')]"));
        tasks.click();
        String expectedTitle="Absence Chart"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Time and Reports title did not appear correctly!");

    }

    @Test
    public void leftSidebarEmployeesTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Employees')]"));
        tasks.click();
        String expectedTitle="Company Structure"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Employees title did not appear correctly!");

    }

    @Test
    public void leftSidebarServicesTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Services')]"));
        tasks.click();
        String expectedTitle="Meeting Rooms"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Services title did not appear correctly!");

    }

    @Test
    public void leftSidebarCompanyTest(){
        WebElement tasks = driver.findElement(By.xpath("//span[contains(.,'Company')]"));
        tasks.click();
        String expectedTitle="Company"; // coming from requirement
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Company title did not appear correctly!");

    }


    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        driver.quit();
    }

}


