package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    By loginLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By signUpLink = By.id("header-sign-up-btn");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);

    }
    public void clickOnPracticeLink(){
        clickOnElement(practiceLink);
    }
    public void clickOnSignUpLink(){
        clickOnElement(signUpLink);
    }


}


