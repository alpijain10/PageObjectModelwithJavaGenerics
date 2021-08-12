package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageGeneric extends BasePage {


    public LoginPageGeneric(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //page locators
    By emailid = By.name("email");
    By password = By.name("password");
    By loginBtn = By.xpath("//div[text()=\"Login\"]");
    //page actions
    public String getLoginPageTitle()
    {
        return driver.getTitle();
    }

    public void doLogin(String uname,String pwd)
    {
        doSendKeys(emailid,uname);
        doSendKeys(password,pwd);
        doClick(loginBtn);
        try{
        Thread.sleep(6000);}
        catch (Exception e){e.printStackTrace();}
    }
}
