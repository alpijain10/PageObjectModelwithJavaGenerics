package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //locators
    By userdisplay= By.xpath("//span[@class=\"user-display\"]");
    By header=By.xpath("//span[@class=\"trial-indicator\"]");

    public String getpageTitle()
    {
        return driver.getTitle();

    }

     public String gethomePageUsername()
    {
        return doGetText(userdisplay);
    }


    public String getHomePageHeader()
    {
        return doGetText(header);
    }
}
