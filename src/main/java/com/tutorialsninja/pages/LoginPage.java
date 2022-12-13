package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    //verify returning customer
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomer;

    public String verifyReturningCustomer() {
        Reporter.log("verifying text Returning customer" + returningCustomer.toString());
        CustomListeners.test.log(Status.PASS,"verifying text Returning customer");
        return getTextFromElement(returningCustomer);
    }

    //4.3 Enter Email address

    @CacheLookup
    @FindBy(id="input-email")
    WebElement email1;

    public void enterEmailField(String text) {
        Reporter.log("enter email" + text + email1.toString());
        sendTextToElement(email1, text);
        CustomListeners.test.log(Status.PASS,"Enter email " + text);
    }

    //4.5 Enter Password
    @CacheLookup
    @FindBy(id="input-password")
    WebElement password1;


    public void enterPasswordField(String text) {
        Reporter.log("enter password :" + text + password1.toString());
        sendTextToElement(password1, text);
        CustomListeners.test.log(Status.PASS,"Enter password : "+ text );
    }

    //4.6 Click on Login button
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton1;


    public void clickOnLoginField() {
        Reporter.log("click on login " + loginButton1.toString());
        mouseHoverToElementAndClick(loginButton1);
        CustomListeners.test.log(Status.PASS,"click on login ");
    }

}
