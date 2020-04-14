package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class LoginPage extends Utility {

    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By loginBt = By.xpath("//input[@name='commit']");

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }
    public void enterPassword(){
        sendTextToElement(passwordField, samePassword);
    }
    public void clickOnLoginBt(){
        clickOnElement(loginBt);
    }
}
