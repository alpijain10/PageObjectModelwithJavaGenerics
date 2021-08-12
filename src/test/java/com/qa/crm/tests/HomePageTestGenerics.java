package com.qa.crm.tests;

import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPageGeneric;
import org.testng.annotations.Test;

public class HomePageTestGenerics extends BaseTest {

    @Test(priority = 1)
    public void homePageTitleTest() {
        pages.getInstance(LoginPageGeneric.class).doLogin("alpijain10@gmail.com", "alpnish10");
        String title = pages.getInstance(HomePage.class).getpageTitle();
        System.out.println("Title of homepage is" + title);

    }

    @Test(priority = 2)
    public void verifyHomePageHeaderTest() {
        pages.getInstance(LoginPageGeneric.class).doLogin("alpijain10@gmail.com", "alpnish10");
        String header = pages.getInstance(HomePage.class).getHomePageHeader();
        System.out.println("Header of homepage is" + header);

    }

    @Test(priority = 3)
    public void verifyuname() {
        pages.getInstance(LoginPageGeneric.class).doLogin("alpijain10@gmail.com", "alpnish10");
        String uname = pages.getInstance(HomePage.class).gethomePageUsername();
        System.out.println("Username homepage is" + uname);

    }
}