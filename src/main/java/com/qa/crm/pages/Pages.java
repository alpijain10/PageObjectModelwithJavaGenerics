package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pages {

    public WebDriver driver;
    public WebDriverWait wait;

    //page constructor:
    public Pages(WebDriver driver,WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;

    }
    //create a method with Java Generics and returns a new Page
    public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
        try {
            return pageClass.getConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }



}
