package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
   // LoginPage loginPage = new LoginPage();

    @Test(groups = {"sanity"})

    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();


    }

}
