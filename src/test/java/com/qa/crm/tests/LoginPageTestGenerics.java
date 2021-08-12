package com.qa.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.crm.pages.*;

public class LoginPageTestGenerics extends BaseTest{
    @Test(priority = 1)
    public void verifyLoginPageTitleTest()
    {
        String title=pages.getInstance(LoginPageGeneric.class).getLoginPageTitle();
        System.out.println("Login page Title is: "+title);
        Assert.assertEquals(title,"Cogmento CRM");
    }

    @Test(priority =2)
    public void loginTest()
    {
        pages.getInstance(LoginPageGeneric.class).doLogin("alpijain10@gmail.com","alpnish10");
        System.out.println("login success");

    }
}

