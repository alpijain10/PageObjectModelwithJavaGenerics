package com.qa.crm.tests;

import com.qa.crm.pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {
    public WebDriver driver;
    public WebDriverWait wait;
    public Pages pages;

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/selenium-java-3.14/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().fullscreen();
        driver.get("https://ui.cogmento.com/");
        try {
            Thread.sleep(6000);
        } catch (Exception e)
        {e.printStackTrace();
        }
        //create the object of page class::Instantiate Page Class
        pages=new Pages(driver,wait);

    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
